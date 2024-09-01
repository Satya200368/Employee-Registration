function onPageChange(currentPage, totalPages, operator) {
  console.log(currentPage);
  let pageNum = operator === "+" ? currentPage + 1 : currentPage - 1;

  // Prevent going beyond the first or last page
  if (pageNum < 1 || pageNum > totalPages) {
    return; // Exit the function if trying to go out of bounds
  }

  let url = new URL(location.href);

  // Set the `pageNum` query parameter
  url.searchParams.set("pageNum", pageNum);

  // Navigate to the updated URL
  location.href = url.toString();
}
