const title = document.querySelector('h1')
const destination = document.querySelector('.api-data');

const xhr = new XMLHttpRequest()
xhr.onreadystatechange = function() {
	if (this.readyState === 4 && xhr.responseText === "") {
		alert("Error.")
	}
	if (this.readyState == 4 && this.status == 200) {
		const res = JSON.parse(xhr.responseText);
		title.innerText = `Comments`
		let html = ''
		if (res.length) {
			res.forEach(item => {
				html += `
					<li>
						<a href="/breed/${item.id}">${item.contents}</a>, Comment: ${item.comment.contents}
					</li>
				`
			})
		} else {
			html = `
				<li>
					<h2>${res.contents}</h2>
					<h3>${res.comment.content}</h3>
				</li>
			`
		}
		destination.innerHTML = html
	}
}

document.querySelector('button').addEventListener('click', executeRequest)

function executeRequest() {
	xhr.open("GET", `/api/breed/${document.querySelector('input').value}`, true)
	xhr.send()
}