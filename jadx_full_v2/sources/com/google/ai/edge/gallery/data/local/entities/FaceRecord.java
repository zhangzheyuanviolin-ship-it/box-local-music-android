            package com.google.ai.edge.gallery.data.local.entities;

            import java.util.Arrays;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.IIl001iO0Io;
            import p000.O0000Ioio00;
            import p000.Oi010OO0;
            
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010\u0017\u001a\u00020\u0018H\u0096\u0080\u0004J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J;\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\n\u0010\u001f\u001a\u00020\u0005HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006 "}, d2 = {"Lcom/google/ai/edge/gallery/data/local/entities/FaceRecord;", "", "id", "", "name", "", "embedding", "", "thumbnail", "createdAt", "<init>", "(JLjava/lang/String;[B[BJ)V", "getId", "()J", "getName", "()Ljava/lang/String;", "getEmbedding", "()[B", "getThumbnail", "getCreatedAt", "equals", "", "other", "hashCode", "", "component1", "component2", "component3", "component4", "component5", "copy", "toString", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 15 */    public final class FaceRecord {
                public static final int $stable = 8;
                private final long createdAt;
                private final byte[] embedding;
                private final long id;
                private final String name;
                private final byte[] thumbnail;

                public FaceRecord(long j, String str, byte[] bArr, byte[] bArr2, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 13 */            this((i & 1) != 0 ? 0L : j, str, bArr, bArr2, j2);
                }

                public static FaceRecord copy$default(FaceRecord faceRecord, long j, String str, byte[] bArr, byte[] bArr2, long j2, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 j = faceRecord.id;
                    }
/* 7 */             long j3 = j;
/* 10 */            if ((i & 2) != 0) {
/* 12 */                str = faceRecord.name;
                    }
/* 14 */            String str2 = str;
/* 17 */            if ((i & 4) != 0) {
/* 19 */                bArr = faceRecord.embedding;
                    }
/* 21 */            byte[] bArr3 = bArr;
/* 24 */            if ((i & 8) != 0) {
/* 26 */                bArr2 = faceRecord.thumbnail;
                    }
/* 28 */            byte[] bArr4 = bArr2;
/* 31 */            if ((i & 16) != 0) {
/* 33 */                j2 = faceRecord.createdAt;
                    }
/* 37 */            return faceRecord.copy(j3, str2, bArr3, bArr4, j2);
                }

                public final long getId() {
/* 1 */             return this.id;
                }

                public final String getName() {
/* 1 */             return this.name;
                }

                public final byte[] getEmbedding() {
/* 1 */             return this.embedding;
                }

                public final byte[] getThumbnail() {
/* 1 */             return this.thumbnail;
                }

                public final long getCreatedAt() {
/* 1 */             return this.createdAt;
                }

                public final FaceRecord copy(long id, String name, byte[] embedding, byte[] thumbnail, long createdAt) {
/* 3 */             return new FaceRecord(id, name, embedding, thumbnail, createdAt);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof FaceRecord)) {
/* 7 */                 return false;
                    }
/* 13 */            FaceRecord faceRecord = (FaceRecord) other;
                    return this.id == faceRecord.id && O0000Ioio00.I0000O(this.name, faceRecord.name) && Arrays.equals(this.embedding, faceRecord.embedding) && Arrays.equals(this.thumbnail, faceRecord.thumbnail) && this.createdAt == faceRecord.createdAt;
                }

                public final long getCreatedAt() {
/* 1 */             return this.createdAt;
                }

                public final byte[] getEmbedding() {
/* 1 */             return this.embedding;
                }

                public final long getId() {
/* 1 */             return this.id;
                }

                public final String getName() {
/* 1 */             return this.name;
                }

                public final byte[] getThumbnail() {
/* 1 */             return this.thumbnail;
                }

                public int hashCode() {
/* 38 */            return Long.hashCode(this.createdAt) + ((Arrays.hashCode(this.thumbnail) + ((Arrays.hashCode(this.embedding) + Oi010OO0.I000O01llI0(Long.hashCode(this.id) * 31, 31, this.name)) * 31)) * 31);
                }

                public String toString() {
/* 1 */             long j = this.id;
/* 3 */             String str = this.name;
/* 7 */             String string = Arrays.toString(this.embedding);
/* 13 */            String string2 = Arrays.toString(this.thumbnail);
/* 17 */            long j2 = this.createdAt;
/* 23 */            StringBuilder sb = new StringBuilder("FaceRecord(id=");
/* 26 */            sb.append(j);
/* 31 */            sb.append(", name=");
/* 34 */            sb.append(str);
/* 41 */            IIl001iO0Io.I001lIiIIo1O(sb, ", embedding=", string, ", thumbnail=", string2);
/* 46 */            sb.append(", createdAt=");
/* 49 */            sb.append(j2);
/* 54 */            sb.append(")");
/* 57 */            return sb.toString();
                }

/* 16 */        public FaceRecord(long j, String str, byte[] bArr, byte[] bArr2, long j2) {
/* 18 */            this.id = j;
/* 19 */            this.name = str;
/* 20 */            this.embedding = bArr;
/* 21 */            this.thumbnail = bArr2;
/* 22 */            this.createdAt = j2;
                }
            }
