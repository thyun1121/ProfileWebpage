function hashtagInformation(cnt, tagName){
	let getBlogSubtitleElem = document.getElementsByClassName('blog__subtitle')[0];
	let str="";
	if(cnt>1)
		str=cnt+" posts for #"+tagName;
	else
		str=cnt+" post for #"+tagName;
	
	getBlogSubtitleElem.innerHTML = str;
	
	//${extraData.cnt} posts for #${extraData.tagName}
}
