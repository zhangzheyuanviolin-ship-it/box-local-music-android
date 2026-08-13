            package com.google.ai.edge.gallery.data.local.entities;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.util.UUID;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.IIl001iO0Io;
            import p000.IIlIOloOOO;
            import p000.O0000Ioio00;
            import p000.Oi010OO0;
            
            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J[\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010&\u001a\u00020\nHÖ\u0081\u0004J\n\u0010'\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006("}, d2 = {"Lcom/google/ai/edge/gallery/data/local/entities/Message;", "", "id", "", "conversationId", "role", "content", "timestamp", "", "tokenCount", "", "latencyMs", "imagePaths", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JIJLjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getConversationId", "getRole", "getContent", "getTimestamp", "()J", "getTokenCount", "()I", "getLatencyMs", "getImagePaths", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 48 */    public final class Message {
                public static final int $stable = 0;
                private final String content;
                private final String conversationId;
                private final String id;
                private final String imagePaths;
                private final long latencyMs;
                private final String role;
                private final long timestamp;
                private final int tokenCount;

                public Message(String str, String str2, String str3, String str4, long j, int i, long j2, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
/* 46 */            this((i2 & 1) != 0 ? UUID.randomUUID().toString() : str, str2, str3, str4, (i2 & 16) != 0 ? System.currentTimeMillis() : j, (i2 & 32) != 0 ? 0 : i, (i2 & 64) != 0 ? 0L : j2, (i2 & Barcode.FORMAT_ITF) != 0 ? null : str5);
                }

                public static Message copy$default(Message message, String str, String str2, String str3, String str4, long j, int i, long j2, String str5, int i2, Object obj) {
/* 3 */             if ((i2 & 1) != 0) {
/* 5 */                 str = message.id;
                    }
/* 9 */             if ((i2 & 2) != 0) {
/* 11 */                str2 = message.conversationId;
                    }
/* 15 */            if ((i2 & 4) != 0) {
/* 17 */                str3 = message.role;
                    }
/* 21 */            if ((i2 & 8) != 0) {
/* 23 */                str4 = message.content;
                    }
/* 27 */            if ((i2 & 16) != 0) {
/* 29 */                j = message.timestamp;
                    }
/* 33 */            if ((i2 & 32) != 0) {
/* 35 */                i = message.tokenCount;
                    }
/* 39 */            if ((i2 & 64) != 0) {
/* 41 */                j2 = message.latencyMs;
                    }
/* 45 */            if ((i2 & Barcode.FORMAT_ITF) != 0) {
/* 47 */                str5 = message.imagePaths;
                    }
/* 51 */            int i3 = i;
/* 52 */            long j3 = j;
/* 53 */            String str6 = str3;
/* 54 */            String str7 = str4;
/* 58 */            return message.copy(str, str2, str6, str7, j3, i3, j2, str5);
                }

                public final String getId() {
/* 1 */             return this.id;
                }

                public final String getConversationId() {
/* 1 */             return this.conversationId;
                }

                public final String getRole() {
/* 1 */             return this.role;
                }

                public final String getContent() {
/* 1 */             return this.content;
                }

                public final long getTimestamp() {
/* 1 */             return this.timestamp;
                }

                public final int getTokenCount() {
/* 1 */             return this.tokenCount;
                }

                public final long getLatencyMs() {
/* 1 */             return this.latencyMs;
                }

                public final String getImagePaths() {
/* 1 */             return this.imagePaths;
                }

                public final Message copy(String id, String conversationId, String role, String content, long timestamp, int tokenCount, long latencyMs, String imagePaths) {
/* 3 */             return new Message(id, conversationId, role, content, timestamp, tokenCount, latencyMs, imagePaths);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof Message)) {
/* 7 */                 return false;
                    }
/* 11 */            Message message = (Message) other;
                    return O0000Ioio00.I0000O(this.id, message.id) && O0000Ioio00.I0000O(this.conversationId, message.conversationId) && O0000Ioio00.I0000O(this.role, message.role) && O0000Ioio00.I0000O(this.content, message.content) && this.timestamp == message.timestamp && this.tokenCount == message.tokenCount && this.latencyMs == message.latencyMs && O0000Ioio00.I0000O(this.imagePaths, message.imagePaths);
                }

                public final String getContent() {
/* 1 */             return this.content;
                }

                public final String getConversationId() {
/* 1 */             return this.conversationId;
                }

                public final String getId() {
/* 1 */             return this.id;
                }

                public final String getImagePaths() {
/* 1 */             return this.imagePaths;
                }

                public final long getLatencyMs() {
/* 1 */             return this.latencyMs;
                }

                public final String getRole() {
/* 1 */             return this.role;
                }

                public final long getTimestamp() {
/* 1 */             return this.timestamp;
                }

                public final int getTokenCount() {
/* 1 */             return this.tokenCount;
                }

                public int hashCode() {
/* 42 */            int iI0000O = IIlIOloOOO.I0000O(this.latencyMs, IIl001iO0Io.I0000O(this.tokenCount, IIlIOloOOO.I0000O(this.timestamp, Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(this.id.hashCode() * 31, 31, this.conversationId), 31, this.role), 31, this.content), 31), 31), 31);
/* 46 */            String str = this.imagePaths;
/* 56 */            return iI0000O + (str == null ? 0 : str.hashCode());
                }

                public String toString() {
/* 1 */             String str = this.id;
/* 3 */             String str2 = this.conversationId;
/* 5 */             String str3 = this.role;
/* 7 */             String str4 = this.content;
/* 9 */             long j = this.timestamp;
/* 11 */            int i = this.tokenCount;
/* 13 */            long j2 = this.latencyMs;
/* 15 */            String str5 = this.imagePaths;
/* 23 */            StringBuilder sbI00111O = IIl001iO0Io.I00111O("Message(id=", str, ", conversationId=", str2, ", role=");
/* 31 */            IIl001iO0Io.I001lIiIIo1O(sbI00111O, str3, ", content=", str4, ", timestamp=");
/* 34 */            sbI00111O.append(j);
/* 39 */            sbI00111O.append(", tokenCount=");
/* 42 */            sbI00111O.append(i);
/* 47 */            sbI00111O.append(", latencyMs=");
/* 50 */            sbI00111O.append(j2);
/* 55 */            sbI00111O.append(", imagePaths=");
/* 60 */            return IIl001iO0Io.I00100l0(sbI00111O, str5, ")");
                }

/* 49 */        public Message(String str, String str2, String str3, String str4, long j, int i, long j2, String str5) {
/* 51 */            this.id = str;
/* 52 */            this.conversationId = str2;
/* 53 */            this.role = str3;
/* 54 */            this.content = str4;
/* 55 */            this.timestamp = j;
/* 56 */            this.tokenCount = i;
/* 57 */            this.latencyMs = j2;
/* 58 */            this.imagePaths = str5;
                }
            }
