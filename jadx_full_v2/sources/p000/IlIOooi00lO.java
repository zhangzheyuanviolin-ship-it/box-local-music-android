            package p000;

            import java.io.File;
            import java.util.List;
            
            public final class IlIOooi00lO {
                public final File I00000oIO;
                public final List I00000oOI;

                public IlIOooi00lO(File file, List list) {
/* 4 */             this.I00000oIO = file;
/* 6 */             this.I00000oOI = list;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 34 */                return true;
                    }
/* 6 */             if (!(obj instanceof IlIOooi00lO)) {
/* 32 */                return false;
                    }
/* 9 */             IlIOooi00lO ilIOooi00lO = (IlIOooi00lO) obj;
                    return this.I00000oIO.equals(ilIOooi00lO.I00000oIO) && this.I00000oOI.equals(ilIOooi00lO.I00000oOI);
                }

                public final int hashCode() {
/* 15 */            return this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 28 */            return "FilePathComponents(root=" + this.I00000oIO + ", segments=" + this.I00000oOI + ')';
                }
            }
