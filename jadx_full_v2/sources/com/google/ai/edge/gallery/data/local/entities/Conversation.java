            package com.google.ai.edge.gallery.data.local.entities;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.util.UUID;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.IIl001iO0Io;
            import p000.IIlIOloOOO;
            import p000.O0000Ioio00;
            import p000.Oi010OO0;
            
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003JY\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0014\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010&\u001a\u00020\u000bHÖ\u0081\u0004J\n\u0010'\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006("}, d2 = {"Lcom/google/ai/edge/gallery/data/local/entities/Conversation;", "", "id", "", "title", "taskType", "modelName", "createdAt", "", "updatedAt", "messageCount", "", "systemPrompt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTitle", "getTaskType", "getModelName", "getCreatedAt", "()J", "getUpdatedAt", "getMessageCount", "()I", "getSystemPrompt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 70 */    public final class Conversation {
                public static final int $stable = 0;
                private final long createdAt;
                private final String id;
                private final int messageCount;
                private final String modelName;
                private final String systemPrompt;
                private final String taskType;
                private final String title;
                private final long updatedAt;

                public Conversation(String str, String str2, String str3, String str4, long j, long j2, int i, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
/* 68 */            this((i2 & 1) != 0 ? UUID.randomUUID().toString() : str, (i2 & 2) != 0 ? "New Chat" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? System.currentTimeMillis() : j, (i2 & 32) != 0 ? System.currentTimeMillis() : j2, (i2 & 64) != 0 ? 0 : i, (i2 & Barcode.FORMAT_ITF) != 0 ? "" : str5);
                }

                public static Conversation copy$default(Conversation conversation, String str, String str2, String str3, String str4, long j, long j2, int i, String str5, int i2, Object obj) {
/* 3 */             if ((i2 & 1) != 0) {
/* 5 */                 str = conversation.id;
                    }
/* 9 */             if ((i2 & 2) != 0) {
/* 11 */                str2 = conversation.title;
                    }
/* 15 */            if ((i2 & 4) != 0) {
/* 17 */                str3 = conversation.taskType;
                    }
/* 21 */            if ((i2 & 8) != 0) {
/* 23 */                str4 = conversation.modelName;
                    }
/* 27 */            if ((i2 & 16) != 0) {
/* 29 */                j = conversation.createdAt;
                    }
/* 33 */            if ((i2 & 32) != 0) {
/* 35 */                j2 = conversation.updatedAt;
                    }
/* 39 */            if ((i2 & 64) != 0) {
/* 41 */                i = conversation.messageCount;
                    }
/* 45 */            if ((i2 & Barcode.FORMAT_ITF) != 0) {
/* 47 */                str5 = conversation.systemPrompt;
                    }
/* 51 */            long j3 = j2;
/* 52 */            long j4 = j;
/* 53 */            String str6 = str3;
/* 54 */            String str7 = str4;
/* 58 */            return conversation.copy(str, str2, str6, str7, j4, j3, i, str5);
                }

                public final String getId() {
/* 1 */             return this.id;
                }

                public final String getTitle() {
/* 1 */             return this.title;
                }

                public final String getTaskType() {
/* 1 */             return this.taskType;
                }

                public final String getModelName() {
/* 1 */             return this.modelName;
                }

                public final long getCreatedAt() {
/* 1 */             return this.createdAt;
                }

                public final long getUpdatedAt() {
/* 1 */             return this.updatedAt;
                }

                public final int getMessageCount() {
/* 1 */             return this.messageCount;
                }

                public final String getSystemPrompt() {
/* 1 */             return this.systemPrompt;
                }

                public final Conversation copy(String id, String title, String taskType, String modelName, long createdAt, long updatedAt, int messageCount, String systemPrompt) {
/* 3 */             return new Conversation(id, title, taskType, modelName, createdAt, updatedAt, messageCount, systemPrompt);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof Conversation)) {
/* 7 */                 return false;
                    }
/* 11 */            Conversation conversation = (Conversation) other;
                    return O0000Ioio00.I0000O(this.id, conversation.id) && O0000Ioio00.I0000O(this.title, conversation.title) && O0000Ioio00.I0000O(this.taskType, conversation.taskType) && O0000Ioio00.I0000O(this.modelName, conversation.modelName) && this.createdAt == conversation.createdAt && this.updatedAt == conversation.updatedAt && this.messageCount == conversation.messageCount && O0000Ioio00.I0000O(this.systemPrompt, conversation.systemPrompt);
                }

                public final long getCreatedAt() {
/* 1 */             return this.createdAt;
                }

                public final String getId() {
/* 1 */             return this.id;
                }

                public final int getMessageCount() {
/* 1 */             return this.messageCount;
                }

                public final String getModelName() {
/* 1 */             return this.modelName;
                }

                public final String getSystemPrompt() {
/* 1 */             return this.systemPrompt;
                }

                public final String getTaskType() {
/* 1 */             return this.taskType;
                }

                public final String getTitle() {
/* 1 */             return this.title;
                }

                public final long getUpdatedAt() {
/* 1 */             return this.updatedAt;
                }

                public int hashCode() {
/* 52 */            return this.systemPrompt.hashCode() + IIl001iO0Io.I0000O(this.messageCount, IIlIOloOOO.I0000O(this.updatedAt, IIlIOloOOO.I0000O(this.createdAt, Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(this.id.hashCode() * 31, 31, this.title), 31, this.taskType), 31, this.modelName), 31), 31), 31);
                }

                public String toString() {
/* 1 */             String str = this.id;
/* 3 */             String str2 = this.title;
/* 5 */             String str3 = this.taskType;
/* 7 */             String str4 = this.modelName;
/* 9 */             long j = this.createdAt;
/* 11 */            long j2 = this.updatedAt;
/* 13 */            int i = this.messageCount;
/* 15 */            String str5 = this.systemPrompt;
/* 23 */            StringBuilder sbI00111O = IIl001iO0Io.I00111O("Conversation(id=", str, ", title=", str2, ", taskType=");
/* 31 */            IIl001iO0Io.I001lIiIIo1O(sbI00111O, str3, ", modelName=", str4, ", createdAt=");
/* 34 */            sbI00111O.append(j);
/* 39 */            sbI00111O.append(", updatedAt=");
/* 42 */            sbI00111O.append(j2);
/* 47 */            sbI00111O.append(", messageCount=");
/* 50 */            sbI00111O.append(i);
/* 55 */            sbI00111O.append(", systemPrompt=");
/* 58 */            sbI00111O.append(str5);
/* 63 */            sbI00111O.append(")");
/* 66 */            return sbI00111O.toString();
                }

/* 71 */        public Conversation(String str, String str2, String str3, String str4, long j, long j2, int i, String str5) {
/* 73 */            this.id = str;
/* 74 */            this.title = str2;
/* 75 */            this.taskType = str3;
/* 76 */            this.modelName = str4;
/* 77 */            this.createdAt = j;
/* 78 */            this.updatedAt = j2;
/* 79 */            this.messageCount = i;
/* 80 */            this.systemPrompt = str5;
                }

/* 80 */        public Conversation() {
/* 81 */            this(null, null, null, null, 0L, 0L, 0, null, 255, null);
                }
            }
