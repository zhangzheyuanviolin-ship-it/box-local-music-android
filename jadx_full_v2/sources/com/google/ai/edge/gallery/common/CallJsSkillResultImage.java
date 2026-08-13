            package com.google.ai.edge.gallery.common;

            import kotlin.Metadata;
            import p000.IlIi0I0;
            import p000.O0000Ioio00;
            import p000.O01III;
            
            @O01III(generateAdapter = true)
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/google/ai/edge/gallery/common/CallJsSkillResultImage;", "", "base64", "", "<init>", "(Ljava/lang/String;)V", "getBase64", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class CallJsSkillResultImage {
                public static final int $stable = 0;
                private final String base64;

                public CallJsSkillResultImage(String str) {
/* 4 */             this.base64 = str;
                }

                public static CallJsSkillResultImage copy$default(CallJsSkillResultImage callJsSkillResultImage, String str, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 str = callJsSkillResultImage.base64;
                    }
/* 7 */             return callJsSkillResultImage.copy(str);
                }

                public final String getBase64() {
/* 1 */             return this.base64;
                }

                public final CallJsSkillResultImage copy(String base64) {
/* 3 */             return new CallJsSkillResultImage(base64);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
                    return (other instanceof CallJsSkillResultImage) && O0000Ioio00.I0000O(this.base64, ((CallJsSkillResultImage) other).base64);
                }

                public final String getBase64() {
/* 1 */             return this.base64;
                }

                public int hashCode() {
/* 1 */             String str = this.base64;
/* 3 */             if (str == null) {
/* 5 */                 return 0;
                    }
/* 7 */             return str.hashCode();
                }

                public String toString() {
/* 7 */             return IlIi0I0.I000lI("CallJsSkillResultImage(base64=", this.base64, ")");
                }
            }
