            package com.google.ai.edge.gallery.customtasks.agentchat;

            import kotlin.Metadata;
            import p000.IIl001iO0Io;
            import p000.O0000Ioio00;
            import p000.O01III;
            import p000.Oi010OO0;
            
            @O01III(generateAdapter = true)
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/google/ai/edge/gallery/customtasks/agentchat/SendEmailParams;", "", "extra_email", "", "extra_subject", "extra_text", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getExtra_email", "()Ljava/lang/String;", "getExtra_subject", "getExtra_text", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class SendEmailParams {
                public static final int $stable = 0;
                private final String extra_email;
                private final String extra_subject;
                private final String extra_text;

                public SendEmailParams(String str, String str2, String str3) {
/* 4 */             this.extra_email = str;
/* 6 */             this.extra_subject = str2;
/* 8 */             this.extra_text = str3;
                }

                public static SendEmailParams copy$default(SendEmailParams sendEmailParams, String str, String str2, String str3, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 str = sendEmailParams.extra_email;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                str2 = sendEmailParams.extra_subject;
                    }
/* 15 */            if ((i & 4) != 0) {
/* 17 */                str3 = sendEmailParams.extra_text;
                    }
/* 19 */            return sendEmailParams.copy(str, str2, str3);
                }

                public final String getExtra_email() {
/* 1 */             return this.extra_email;
                }

                public final String getExtra_subject() {
/* 1 */             return this.extra_subject;
                }

                public final String getExtra_text() {
/* 1 */             return this.extra_text;
                }

                public final SendEmailParams copy(String extra_email, String extra_subject, String extra_text) {
/* 3 */             return new SendEmailParams(extra_email, extra_subject, extra_text);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof SendEmailParams)) {
/* 7 */                 return false;
                    }
/* 11 */            SendEmailParams sendEmailParams = (SendEmailParams) other;
                    return O0000Ioio00.I0000O(this.extra_email, sendEmailParams.extra_email) && O0000Ioio00.I0000O(this.extra_subject, sendEmailParams.extra_subject) && O0000Ioio00.I0000O(this.extra_text, sendEmailParams.extra_text);
                }

                public final String getExtra_email() {
/* 1 */             return this.extra_email;
                }

                public final String getExtra_subject() {
/* 1 */             return this.extra_subject;
                }

                public final String getExtra_text() {
/* 1 */             return this.extra_text;
                }

                public int hashCode() {
/* 22 */            return this.extra_text.hashCode() + Oi010OO0.I000O01llI0(this.extra_email.hashCode() * 31, 31, this.extra_subject);
                }

                public String toString() {
/* 1 */             String str = this.extra_email;
/* 3 */             String str2 = this.extra_subject;
/* 19 */            return IIl001iO0Io.I00100l0(IIl001iO0Io.I00111O("SendEmailParams(extra_email=", str, ", extra_subject=", str2, ", extra_text="), this.extra_text, ")");
                }
            }
