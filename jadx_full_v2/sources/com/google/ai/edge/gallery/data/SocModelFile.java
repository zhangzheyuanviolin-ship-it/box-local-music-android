            package com.google.ai.edge.gallery.data;

            import kotlin.Metadata;
            import p000.IIl001iO0Io;
            import p000.O0000Ioio00;
            import p000.OiliO0I;
            
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ>\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/google/ai/edge/gallery/data/SocModelFile;", "", "modelFile", "", "url", "commitHash", "sizeInBytes", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getModelFile", "()Ljava/lang/String;", "getUrl", "getCommitHash", "getSizeInBytes", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/google/ai/edge/gallery/data/SocModelFile;", "equals", "", "other", "hashCode", "", "toString", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class SocModelFile {
                public static final int $stable = 0;

                @OiliO0I("commitHash")
                private final String commitHash;

                @OiliO0I("modelFile")
                private final String modelFile;

                @OiliO0I("sizeInBytes")
                private final Long sizeInBytes;

                @OiliO0I("url")
                private final String url;

                public SocModelFile(String str, String str2, String str3, Long l) {
/* 4 */             this.modelFile = str;
/* 6 */             this.url = str2;
/* 8 */             this.commitHash = str3;
/* 10 */            this.sizeInBytes = l;
                }

                public static SocModelFile copy$default(SocModelFile socModelFile, String str, String str2, String str3, Long l, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 str = socModelFile.modelFile;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                str2 = socModelFile.url;
                    }
/* 15 */            if ((i & 4) != 0) {
/* 17 */                str3 = socModelFile.commitHash;
                    }
/* 21 */            if ((i & 8) != 0) {
/* 23 */                l = socModelFile.sizeInBytes;
                    }
/* 25 */            return socModelFile.copy(str, str2, str3, l);
                }

                public final String getModelFile() {
/* 1 */             return this.modelFile;
                }

                public final String getUrl() {
/* 1 */             return this.url;
                }

                public final String getCommitHash() {
/* 1 */             return this.commitHash;
                }

                public final Long getSizeInBytes() {
/* 1 */             return this.sizeInBytes;
                }

                public final SocModelFile copy(String modelFile, String url, String commitHash, Long sizeInBytes) {
/* 3 */             return new SocModelFile(modelFile, url, commitHash, sizeInBytes);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof SocModelFile)) {
/* 7 */                 return false;
                    }
/* 11 */            SocModelFile socModelFile = (SocModelFile) other;
                    return O0000Ioio00.I0000O(this.modelFile, socModelFile.modelFile) && O0000Ioio00.I0000O(this.url, socModelFile.url) && O0000Ioio00.I0000O(this.commitHash, socModelFile.commitHash) && O0000Ioio00.I0000O(this.sizeInBytes, socModelFile.sizeInBytes);
                }

                public final String getCommitHash() {
/* 1 */             return this.commitHash;
                }

                public final String getModelFile() {
/* 1 */             return this.modelFile;
                }

                public final Long getSizeInBytes() {
/* 1 */             return this.sizeInBytes;
                }

                public final String getUrl() {
/* 1 */             return this.url;
                }

                public int hashCode() {
/* 1 */             String str = this.modelFile;
/* 12 */            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
/* 14 */            String str2 = this.url;
/* 25 */            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
/* 27 */            String str3 = this.commitHash;
/* 38 */            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
/* 40 */            Long l = this.sizeInBytes;
/* 49 */            return iHashCode3 + (l != null ? l.hashCode() : 0);
                }

                public String toString() {
/* 1 */             String str = this.modelFile;
/* 3 */             String str2 = this.url;
/* 5 */             String str3 = this.commitHash;
/* 7 */             Long l = this.sizeInBytes;
/* 15 */            StringBuilder sbI00111O = IIl001iO0Io.I00111O("SocModelFile(modelFile=", str, ", url=", str2, ", commitHash=");
/* 19 */            sbI00111O.append(str3);
/* 24 */            sbI00111O.append(", sizeInBytes=");
/* 27 */            sbI00111O.append(l);
/* 32 */            sbI00111O.append(")");
/* 35 */            return sbI00111O.toString();
                }
            }
