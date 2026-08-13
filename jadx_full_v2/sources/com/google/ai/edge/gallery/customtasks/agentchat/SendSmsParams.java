            package com.google.ai.edge.gallery.customtasks.agentchat;

            import kotlin.Metadata;
            import p000.O0000Ioio00;
            import p000.O01III;
            import p000.Oi010OO0;
            
            @O01III(generateAdapter = true)
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/google/ai/edge/gallery/customtasks/agentchat/SendSmsParams;", "", "phone_number", "", "sms_body", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPhone_number", "()Ljava/lang/String;", "getSms_body", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class SendSmsParams {
                public static final int $stable = 0;
                private final String phone_number;
                private final String sms_body;

                public SendSmsParams(String str, String str2) {
/* 4 */             this.phone_number = str;
/* 6 */             this.sms_body = str2;
                }

                public static SendSmsParams copy$default(SendSmsParams sendSmsParams, String str, String str2, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 str = sendSmsParams.phone_number;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                str2 = sendSmsParams.sms_body;
                    }
/* 13 */            return sendSmsParams.copy(str, str2);
                }

                public final String getPhone_number() {
/* 1 */             return this.phone_number;
                }

                public final String getSms_body() {
/* 1 */             return this.sms_body;
                }

                public final SendSmsParams copy(String phone_number, String sms_body) {
/* 3 */             return new SendSmsParams(phone_number, sms_body);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof SendSmsParams)) {
/* 7 */                 return false;
                    }
/* 11 */            SendSmsParams sendSmsParams = (SendSmsParams) other;
                    return O0000Ioio00.I0000O(this.phone_number, sendSmsParams.phone_number) && O0000Ioio00.I0000O(this.sms_body, sendSmsParams.sms_body);
                }

                public final String getPhone_number() {
/* 1 */             return this.phone_number;
                }

                public final String getSms_body() {
/* 1 */             return this.sms_body;
                }

                public int hashCode() {
/* 15 */            return this.sms_body.hashCode() + (this.phone_number.hashCode() * 31);
                }

                public String toString() {
/* 11 */            return Oi010OO0.I001IO000("SendSmsParams(phone_number=", this.phone_number, ", sms_body=", this.sms_body, ")");
                }
            }
