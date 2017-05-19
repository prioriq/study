function isKorean(input) {
	if(input == '') {
		return false;
	}
	return input.replace(/[ㄱ-ㅎㅏ-ㅣ가-힣]+/, '') == '';
}
function isEnglish(input) {
	if(input == '') {
		return false;
	}
	return input.replace(/[a-zA-Z]+/, '') == '';
}