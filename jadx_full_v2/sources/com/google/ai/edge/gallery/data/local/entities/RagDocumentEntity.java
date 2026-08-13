            package com.google.ai.edge.gallery.data.local.entities;

            import kotlin.Metadata;
            import p000.IIl001iO0Io;
            import p000.IIlIOloOOO;
            import p000.O0000Ioio00;
            import p000.Oi010OO0;
            
            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0014\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/google/ai/edge/gallery/data/local/entities/RagDocumentEntity;", "", "id", "", "title", "uri", "createdAt", "", "chunkCount", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V", "getId", "()Ljava/lang/String;", "getTitle", "getUri", "getCreatedAt", "()J", "getChunkCount", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class RagDocumentEntity {
                public static final int $stable = 0;
                private final int chunkCount;
                private final long createdAt;
                private final String id;
                private final String title;
                private final String uri;

                public RagDocumentEntity(String str, String str2, String str3, long j, int i) {
/* 4 */             this.id = str;
/* 6 */             this.title = str2;
/* 8 */             this.uri = str3;
/* 10 */            this.createdAt = j;
/* 12 */            this.chunkCount = i;
                }

                public static RagDocumentEntity copy$default(RagDocumentEntity ragDocumentEntity, String str, String str2, String str3, long j, int i, int i2, Object obj) {
/* 3 */             if ((i2 & 1) != 0) {
/* 5 */                 str = ragDocumentEntity.id;
                    }
/* 9 */             if ((i2 & 2) != 0) {
/* 11 */                str2 = ragDocumentEntity.title;
                    }
/* 15 */            if ((i2 & 4) != 0) {
/* 17 */                str3 = ragDocumentEntity.uri;
                    }
/* 21 */            if ((i2 & 8) != 0) {
/* 23 */                j = ragDocumentEntity.createdAt;
                    }
/* 27 */            if ((i2 & 16) != 0) {
/* 29 */                i = ragDocumentEntity.chunkCount;
                    }
/* 31 */            int i3 = i;
/* 34 */            String str4 = str3;
/* 37 */            return ragDocumentEntity.copy(str, str2, str4, j, i3);
                }

                public final String getId() {
/* 1 */             return this.id;
                }

                public final String getTitle() {
/* 1 */             return this.title;
                }

                public final String getUri() {
/* 1 */             return this.uri;
                }

                public final long getCreatedAt() {
/* 1 */             return this.createdAt;
                }

                public final int getChunkCount() {
/* 1 */             return this.chunkCount;
                }

                public final RagDocumentEntity copy(String id, String title, String uri, long createdAt, int chunkCount) {
/* 3 */             return new RagDocumentEntity(id, title, uri, createdAt, chunkCount);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof RagDocumentEntity)) {
/* 7 */                 return false;
                    }
/* 11 */            RagDocumentEntity ragDocumentEntity = (RagDocumentEntity) other;
                    return O0000Ioio00.I0000O(this.id, ragDocumentEntity.id) && O0000Ioio00.I0000O(this.title, ragDocumentEntity.title) && O0000Ioio00.I0000O(this.uri, ragDocumentEntity.uri) && this.createdAt == ragDocumentEntity.createdAt && this.chunkCount == ragDocumentEntity.chunkCount;
                }

                public final int getChunkCount() {
/* 1 */             return this.chunkCount;
                }

                public final long getCreatedAt() {
/* 1 */             return this.createdAt;
                }

                public final String getId() {
/* 1 */             return this.id;
                }

                public final String getTitle() {
/* 1 */             return this.title;
                }

                public final String getUri() {
/* 1 */             return this.uri;
                }

                public int hashCode() {
/* 34 */            return Integer.hashCode(this.chunkCount) + IIlIOloOOO.I0000O(this.createdAt, Oi010OO0.I000O01llI0(Oi010OO0.I000O01llI0(this.id.hashCode() * 31, 31, this.title), 31, this.uri), 31);
                }

                public String toString() {
/* 1 */             String str = this.id;
/* 3 */             String str2 = this.title;
/* 5 */             String str3 = this.uri;
/* 7 */             long j = this.createdAt;
/* 9 */             int i = this.chunkCount;
/* 17 */            StringBuilder sbI00111O = IIl001iO0Io.I00111O("RagDocumentEntity(id=", str, ", title=", str2, ", uri=");
/* 21 */            sbI00111O.append(str3);
/* 26 */            sbI00111O.append(", createdAt=");
/* 29 */            sbI00111O.append(j);
/* 36 */            return IIlIOloOOO.I00100o1O0lo(sbI00111O, ", chunkCount=", i, ")");
                }
            }
