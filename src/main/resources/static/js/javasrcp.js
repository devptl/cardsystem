function showBank() {
	var x = document.getElementById("formcontainer");
	x.style.display = "none";

	var y = document.getElementById("cardcontainer");
	y.style.display = "none";

}

function autotab(current, to) {
	if (current.getAttribute
			&& current.value.length == current.getAttribute("maxlength")) {
		to.focus();
	}
}

function showBankAndForm() {

	var y = document.getElementById("cardcontainer");
	y.style.display = "none";

}

function showForm() {

	var y = document.getElementById("cardcontainer");
	y.style.display = "none";

}

function showFormAndCard(bgcol) {

	var b = document.getElementById("cardcontainer1");
	b.style.backgroundColor = bgcol;

	var c = document.getElementById("cardcontainer2");
	c.style.backgroundColor = bgcol;

}
