            package com.google.ai.edge.gallery.data.local.entities;

            import java.util.Arrays;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.IIlIOloOOO;
            import p000.O0000Ioio00;
            import p000.Oi010OO0;
            
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u0019\u001a\u00020\u0007H\u0096\u0080\u0004J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J;\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\n\u0010 \u001a\u00020\u0005HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lcom/google/ai/edge/gallery/data/local/entities/RagChunkEntity;", "", "id", "", "documentId", "", "ordinal", "", "text", "embedding", "", "<init>", "(JLjava/lang/String;ILjava/lang/String;[B)V", "getId", "()J", "getDocumentId", "()Ljava/lang/String;", "getOrdinal", "()I", "getText", "getEmbedding", "()[B", "equals", "", "other", "hashCode", "component1", "component2", "component3", "component4", "component5", "copy", "toString", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 15 */    public final class RagChunkEntity {
                public static final int $stable = 8;
                private final String documentId;
                private final byte[] embedding;
                private final long id;
                private final int ordinal;
                private final String text;

                public RagChunkEntity(long j, String str, int i, String str2, byte[] bArr, int i2, DefaultConstructorMarker defaultConstructorMarker) {
/* 13 */            this((i2 & 1) != 0 ? 0L : j, str, i, str2, bArr);
                }

                public static RagChunkEntity copy$default(RagChunkEntity ragChunkEntity, long j, String str, int i, String str2, byte[] bArr, int i2, Object obj) {
/* 3 */             if ((i2 & 1) != 0) {
/* 5 */                 j = ragChunkEntity.id;
                    }
/* 7 */             long j2 = j;
/* 10 */            if ((i2 & 2) != 0) {
/* 12 */                str = ragChunkEntity.documentId;
                    }
/* 14 */            String str3 = str;
/* 17 */            if ((i2 & 4) != 0) {
/* 19 */                i = ragChunkEntity.ordinal;
                    }
/* 21 */            int i3 = i;
/* 24 */            if ((i2 & 8) != 0) {
/* 26 */                str2 = ragChunkEntity.text;
                    }
/* 28 */            String str4 = str2;
/* 31 */            if ((i2 & 16) != 0) {
/* 33 */                bArr = ragChunkEntity.embedding;
                    }
/* 37 */            return ragChunkEntity.copy(j2, str3, i3, str4, bArr);
                }

                public final long getId() {
/* 1 */             return this.id;
                }

                public final String getDocumentId() {
/* 1 */             return this.documentId;
                }

                public final int getOrdinal() {
/* 1 */             return this.ordinal;
                }

                public final String getText() {
/* 1 */             return this.text;
                }

                public final byte[] getEmbedding() {
/* 1 */             return this.embedding;
                }

                public final RagChunkEntity copy(long id, String documentId, int ordinal, String text, byte[] embedding) {
/* 3 */             return new RagChunkEntity(id, documentId, ordinal, text, embedding);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof RagChunkEntity)) {
/* 7 */                 return false;
                    }
/* 13 */            RagChunkEntity ragChunkEntity = (RagChunkEntity) other;
                    return this.id == ragChunkEntity.id && O0000Ioio00.I0000O(this.documentId, ragChunkEntity.documentId) && this.ordinal == ragChunkEntity.ordinal && O0000Ioio00.I0000O(this.text, ragChunkEntity.text) && Arrays.equals(this.embedding, ragChunkEntity.embedding);
                }

                public final String getDocumentId() {
/* 1 */             return this.documentId;
                }

                public final byte[] getEmbedding() {
/* 1 */             return this.embedding;
                }

                public final long getId() {
/* 1 */             return this.id;
                }

                public final int getOrdinal() {
/* 1 */             return this.ordinal;
                }

                public final String getText() {
/* 1 */             return this.text;
                }

                public int hashCode() {
/* 32 */            return Arrays.hashCode(this.embedding) + Oi010OO0.I000O01llI0((Oi010OO0.I000O01llI0(Long.hashCode(this.id) * 31, 31, this.documentId) + this.ordinal) * 31, 31, this.text);
                }

                public String toString() {
/* 1 */             long j = this.id;
/* 3 */             String str = this.documentId;
/* 5 */             int i = this.ordinal;
/* 7 */             String str2 = this.text;
/* 11 */            String string = Arrays.toString(this.embedding);
/* 19 */            StringBuilder sb = new StringBuilder("RagChunkEntity(id=");
/* 22 */            sb.append(j);
/* 27 */            sb.append(", documentId=");
/* 30 */            sb.append(str);
/* 35 */            sb.append(", ordinal=");
/* 38 */            sb.append(i);
/* 43 */            sb.append(", text=");
/* 46 */            sb.append(str2);
/* 53 */            return IIlIOloOOO.I0010I0i(sb, ", embedding=", string, ")");
                }

/* 16 */        public RagChunkEntity(long j, String str, int i, String str2, byte[] bArr) {
/* 18 */            this.id = j;
/* 19 */            this.documentId = str;
/* 20 */            this.ordinal = i;
/* 21 */            this.text = str2;
/* 22 */            this.embedding = bArr;
                }
            }
