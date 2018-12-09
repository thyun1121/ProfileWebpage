var hashtags = document.getElementsByClassName("post__info")[0];

var rewriteHashtags = function(strHashtags) {
	let arryHashtags = strHashtags.split(",");
	let hashtagInHtml = "";
	
	arryHashtags.map(hashtag=>{
		let hashAtag = document.createElement("a");
		hashAtag.href="/tag/"+hashtag;
		hashAtag.innerHTML=hashtag;		//해시태그 값 넣기.
		hashtags.append(hashAtag);		
	});	
};

//rewriteHashtags(hashtags.textContent);
