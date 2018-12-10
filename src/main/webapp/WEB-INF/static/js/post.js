var hashtags = document.getElementsByClassName("post__info")[0];

var rewriteHashtags = function(strHashtags) {
	let arryHashtags = strHashtags.split(",");
	arryHashtags.pop();		//마지막 빈값 제거.
	let hashtagInHtml = "";
	
	arryHashtags.map(hashtag=>{
		let hashAtag = document.createElement("a");
		hashAtag.href="/tag/"+hashtag;
		hashAtag.innerHTML="#"+hashtag;		//해시태그 값 넣기.
		hashtags.append(hashAtag);		
	});	
};
