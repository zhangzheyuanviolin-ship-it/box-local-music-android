            package androidx.work.impl.model;

            import kotlin.Metadata;
            import p000.IIl001iO0Io;
            import p000.O0000Ioio00;
            import p000.Oi010OO0;
            
            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0010\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Landroidx/work/impl/model/SystemIdInfo;", "", "workSpecId", "", "generation", "", "systemId", "<init>", "(Ljava/lang/String;II)V", "getGeneration", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "work-runtime_release"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            public final class SystemIdInfo {
                private final int generation;
                public final int systemId;
                public final String workSpecId;

                public SystemIdInfo(String str, int i, int i2) {
/* 4 */             this.workSpecId = str;
/* 6 */             this.generation = i;
/* 8 */             this.systemId = i2;
                }

                public static SystemIdInfo copy$default(SystemIdInfo systemIdInfo, String str, int i, int i2, int i3, Object obj) {
/* 3 */             if ((i3 & 1) != 0) {
/* 5 */                 str = systemIdInfo.workSpecId;
                    }
/* 9 */             if ((i3 & 2) != 0) {
/* 11 */                i = systemIdInfo.generation;
                    }
/* 15 */            if ((i3 & 4) != 0) {
/* 17 */                i2 = systemIdInfo.systemId;
                    }
/* 19 */            return systemIdInfo.copy(str, i, i2);
                }

                public final String getWorkSpecId() {
/* 1 */             return this.workSpecId;
                }

                public final int getGeneration() {
/* 1 */             return this.generation;
                }

                public final int getSystemId() {
/* 1 */             return this.systemId;
                }

                public final SystemIdInfo copy(String workSpecId, int generation, int systemId) {
/* 3 */             return new SystemIdInfo(workSpecId, generation, systemId);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof SystemIdInfo)) {
/* 7 */                 return false;
                    }
/* 11 */            SystemIdInfo systemIdInfo = (SystemIdInfo) other;
                    return O0000Ioio00.I0000O(this.workSpecId, systemIdInfo.workSpecId) && this.generation == systemIdInfo.generation && this.systemId == systemIdInfo.systemId;
                }

                public final int getGeneration() {
/* 1 */             return this.generation;
                }

                public int hashCode() {
/* 22 */            return Integer.hashCode(this.systemId) + IIl001iO0Io.I0000O(this.generation, this.workSpecId.hashCode() * 31, 31);
                }

                public String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("SystemIdInfo(workSpecId=");
/* 10 */            sb.append(this.workSpecId);
/* 15 */            sb.append(", generation=");
/* 20 */            sb.append(this.generation);
/* 25 */            sb.append(", systemId=");
/* 32 */            return Oi010OO0.I001i1lo1io(sb, this.systemId, ')');
                }
            }
