            package com.google.ai.edge.gallery.common;

            import kotlin.Metadata;
            import p000.IIl001iO0Io;
            import p000.O0000Ioio00;
            import p000.O01III;
            
            @O01III(generateAdapter = true)
            @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/google/ai/edge/gallery/common/CallJsSkillResult;", "", "result", "", "error", "image", "Lcom/google/ai/edge/gallery/common/CallJsSkillResultImage;", "webview", "Lcom/google/ai/edge/gallery/common/CallJsSkillResultWebview;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/google/ai/edge/gallery/common/CallJsSkillResultImage;Lcom/google/ai/edge/gallery/common/CallJsSkillResultWebview;)V", "getResult", "()Ljava/lang/String;", "getError", "getImage", "()Lcom/google/ai/edge/gallery/common/CallJsSkillResultImage;", "getWebview", "()Lcom/google/ai/edge/gallery/common/CallJsSkillResultWebview;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class CallJsSkillResult {
                public static final int $stable = 0;
                private final String error;
                private final CallJsSkillResultImage image;
                private final String result;
                private final CallJsSkillResultWebview webview;

                public CallJsSkillResult(String str, String str2, CallJsSkillResultImage callJsSkillResultImage, CallJsSkillResultWebview callJsSkillResultWebview) {
/* 4 */             this.result = str;
/* 6 */             this.error = str2;
/* 8 */             this.image = callJsSkillResultImage;
/* 10 */            this.webview = callJsSkillResultWebview;
                }

                public static CallJsSkillResult copy$default(CallJsSkillResult callJsSkillResult, String str, String str2, CallJsSkillResultImage callJsSkillResultImage, CallJsSkillResultWebview callJsSkillResultWebview, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 str = callJsSkillResult.result;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                str2 = callJsSkillResult.error;
                    }
/* 15 */            if ((i & 4) != 0) {
/* 17 */                callJsSkillResultImage = callJsSkillResult.image;
                    }
/* 21 */            if ((i & 8) != 0) {
/* 23 */                callJsSkillResultWebview = callJsSkillResult.webview;
                    }
/* 25 */            return callJsSkillResult.copy(str, str2, callJsSkillResultImage, callJsSkillResultWebview);
                }

                public final String getResult() {
/* 1 */             return this.result;
                }

                public final String getError() {
/* 1 */             return this.error;
                }

                public final CallJsSkillResultImage getImage() {
/* 1 */             return this.image;
                }

                public final CallJsSkillResultWebview getWebview() {
/* 1 */             return this.webview;
                }

                public final CallJsSkillResult copy(String result, String error, CallJsSkillResultImage image, CallJsSkillResultWebview webview) {
/* 3 */             return new CallJsSkillResult(result, error, image, webview);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof CallJsSkillResult)) {
/* 7 */                 return false;
                    }
/* 11 */            CallJsSkillResult callJsSkillResult = (CallJsSkillResult) other;
                    return O0000Ioio00.I0000O(this.result, callJsSkillResult.result) && O0000Ioio00.I0000O(this.error, callJsSkillResult.error) && O0000Ioio00.I0000O(this.image, callJsSkillResult.image) && O0000Ioio00.I0000O(this.webview, callJsSkillResult.webview);
                }

                public final String getError() {
/* 1 */             return this.error;
                }

                public final CallJsSkillResultImage getImage() {
/* 1 */             return this.image;
                }

                public final String getResult() {
/* 1 */             return this.result;
                }

                public final CallJsSkillResultWebview getWebview() {
/* 1 */             return this.webview;
                }

                public int hashCode() {
/* 1 */             String str = this.result;
/* 12 */            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
/* 14 */            String str2 = this.error;
/* 25 */            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
/* 27 */            CallJsSkillResultImage callJsSkillResultImage = this.image;
/* 38 */            int iHashCode3 = (iHashCode2 + (callJsSkillResultImage == null ? 0 : callJsSkillResultImage.hashCode())) * 31;
/* 40 */            CallJsSkillResultWebview callJsSkillResultWebview = this.webview;
/* 49 */            return iHashCode3 + (callJsSkillResultWebview != null ? callJsSkillResultWebview.hashCode() : 0);
                }

                public String toString() {
/* 1 */             String str = this.result;
/* 3 */             String str2 = this.error;
/* 5 */             CallJsSkillResultImage callJsSkillResultImage = this.image;
/* 7 */             CallJsSkillResultWebview callJsSkillResultWebview = this.webview;
/* 15 */            StringBuilder sbI00111O = IIl001iO0Io.I00111O("CallJsSkillResult(result=", str, ", error=", str2, ", image=");
/* 19 */            sbI00111O.append(callJsSkillResultImage);
/* 24 */            sbI00111O.append(", webview=");
/* 27 */            sbI00111O.append(callJsSkillResultWebview);
/* 32 */            sbI00111O.append(")");
/* 35 */            return sbI00111O.toString();
                }
            }
