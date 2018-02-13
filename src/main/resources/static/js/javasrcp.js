function showBank() {
	var x = document.getElementById("formcontainer");
	x.style.display = "none";

}

function autotab(current, to) {
	if (current.getAttribute
			&& current.value.length == current.getAttribute("maxlength")) {
		    var f = document.getElementById(to);
	        f.focus();
	}
}


function showBankAndForm() {

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
