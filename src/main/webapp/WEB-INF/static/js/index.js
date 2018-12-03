var menu_btn = document.querySelector(".button__toggle");

menu_btn.addEventListener("click", (event) => {
  var menu_item = document.getElementsByClassName("navigation")[0];
  if (menu_item.getAttribute("class") == "navigation menu__item__hide") {
    // menu_item.style.height = menu_item.scrollHeight + "px";
    menu_item.setAttribute("class", "navigation menu__item__show");
  } else {
    menu_item.setAttribute("class", "navigation menu__item__hide");
  }

  // var result = menu_item.classList.toggle("menu__item__hide"); // false : menu show, true : menu hide
  // console.log(result); //ERASE!!
  // if (result == true) menu_item.style.height = "0px";
  // else menu_item.style.height = menu_item.scrollHeight + "px"; //for show/hide animation.
});
