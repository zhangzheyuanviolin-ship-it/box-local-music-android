            package com.google.ai.edge.gallery.common;

            import kotlin.Metadata;
            import p000.O0000Ioio00;
            import p000.O01III;
            
            @O01III(generateAdapter = true)
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J2\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/google/ai/edge/gallery/common/CallJsSkillResultWebview;", "", "url", "", "iframe", "", "aspectRatio", "", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Float;)V", "getUrl", "()Ljava/lang/String;", "getIframe", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAspectRatio", "()Ljava/lang/Float;", "Ljava/lang/Float;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Float;)Lcom/google/ai/edge/gallery/common/CallJsSkillResultWebview;", "equals", "other", "hashCode", "", "toString", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class CallJsSkillResultWebview {
                public static final int $stable = 0;
                private final Float aspectRatio;
                private final Boolean iframe;
                private final String url;

                public CallJsSkillResultWebview(String str, Boolean bool, Float f) {
/* 4 */             this.url = str;
/* 6 */             this.iframe = bool;
/* 8 */             this.aspectRatio = f;
                }

                public static CallJsSkillResultWebview copy$default(CallJsSkillResultWebview callJsSkillResultWebview, String str, Boolean bool, Float f, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 str = callJsSkillResultWebview.url;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                bool = callJsSkillResultWebview.iframe;
                    }
/* 15 */            if ((i & 4) != 0) {
/* 17 */                f = callJsSkillResultWebview.aspectRatio;
                    }
/* 19 */            return callJsSkillResultWebview.copy(str, bool, f);
                }

                public final String getUrl() {
/* 1 */             return this.url;
                }

                public final Boolean getIframe() {
/* 1 */             return this.iframe;
                }

                public final Float getAspectRatio() {
/* 1 */             return this.aspectRatio;
                }

                public final CallJsSkillResultWebview copy(String url, Boolean iframe, Float aspectRatio) {
/* 3 */             return new CallJsSkillResultWebview(url, iframe, aspectRatio);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof CallJsSkillResultWebview)) {
/* 7 */                 return false;
                    }
/* 11 */            CallJsSkillResultWebview callJsSkillResultWebview = (CallJsSkillResultWebview) other;
                    return O0000Ioio00.I0000O(this.url, callJsSkillResultWebview.url) && O0000Ioio00.I0000O(this.iframe, callJsSkillResultWebview.iframe) && O0000Ioio00.I0000O(this.aspectRatio, callJsSkillResultWebview.aspectRatio);
                }

                public final Float getAspectRatio() {
/* 1 */             return this.aspectRatio;
                }

                public final Boolean getIframe() {
/* 1 */             return this.iframe;
                }

                public final String getUrl() {
/* 1 */             return this.url;
                }

                public int hashCode() {
/* 1 */             String str = this.url;
/* 12 */            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
/* 14 */            Boolean bool = this.iframe;
/* 25 */            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
/* 27 */            Float f = this.aspectRatio;
/* 36 */            return iHashCode2 + (f != null ? f.hashCode() : 0);
                }

                public String toString() {
/* 38 */            return "CallJsSkillResultWebview(url=" + this.url + ", iframe=" + this.iframe + ", aspectRatio=" + this.aspectRatio + ")";
                }
            }
