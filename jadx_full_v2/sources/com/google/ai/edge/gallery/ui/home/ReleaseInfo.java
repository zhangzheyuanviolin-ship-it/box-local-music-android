            package com.google.ai.edge.gallery.ui.home;

            import kotlin.Metadata;
            import p000.O0000Ioio00;
            import p000.Oi010OO0;
            
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/google/ai/edge/gallery/ui/home/ReleaseInfo;", "", "html_url", "", "tag_name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getHtml_url", "()Ljava/lang/String;", "getTag_name", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class ReleaseInfo {
                public static final int $stable = 0;
                private final String html_url;
                private final String tag_name;

                public ReleaseInfo(String str, String str2) {
/* 4 */             this.html_url = str;
/* 6 */             this.tag_name = str2;
                }

                public static ReleaseInfo copy$default(ReleaseInfo releaseInfo, String str, String str2, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 str = releaseInfo.html_url;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                str2 = releaseInfo.tag_name;
                    }
/* 13 */            return releaseInfo.copy(str, str2);
                }

                public final String getHtml_url() {
/* 1 */             return this.html_url;
                }

                public final String getTag_name() {
/* 1 */             return this.tag_name;
                }

                public final ReleaseInfo copy(String html_url, String tag_name) {
/* 3 */             return new ReleaseInfo(html_url, tag_name);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof ReleaseInfo)) {
/* 7 */                 return false;
                    }
/* 11 */            ReleaseInfo releaseInfo = (ReleaseInfo) other;
                    return O0000Ioio00.I0000O(this.html_url, releaseInfo.html_url) && O0000Ioio00.I0000O(this.tag_name, releaseInfo.tag_name);
                }

                public final String getHtml_url() {
/* 1 */             return this.html_url;
                }

                public final String getTag_name() {
/* 1 */             return this.tag_name;
                }

                public int hashCode() {
/* 15 */            return this.tag_name.hashCode() + (this.html_url.hashCode() * 31);
                }

                public String toString() {
/* 11 */            return Oi010OO0.I001IO000("ReleaseInfo(html_url=", this.html_url, ", tag_name=", this.tag_name, ")");
                }
            }
