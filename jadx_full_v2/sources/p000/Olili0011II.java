            package p000;

            import java.util.List;
            
            public final class Olili0011II {
                public List I00000oIO;
                public List I00000oOI;
                public int I0000Il00O;
                public int I0000O;
                public int I0000oI00;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 55 */                return true;
                    }
/* 6 */             if (!(obj instanceof Olili0011II)) {
/* 53 */                return false;
                    }
/* 9 */             Olili0011II olili0011II = (Olili0011II) obj;
                    return this.I00000oIO.equals(olili0011II.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, olili0011II.I00000oOI) && this.I0000Il00O == olili0011II.I0000Il00O && this.I0000O == olili0011II.I0000O && this.I0000oI00 == olili0011II.I0000oI00;
                }

                public final int hashCode() {
/* 9 */             int iHashCode = this.I00000oIO.hashCode() * 31;
/* 10 */            List list = this.I00000oOI;
/* 40 */            return Integer.hashCode(this.I0000oI00) + IIl001iO0Io.I0000O(this.I0000O, IIl001iO0Io.I0000O(this.I0000Il00O, (iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31), 31);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("BestSizesAndMaxFpsForConfigs(bestSizes=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", bestSizesForStreamUseCase=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", maxFpsForBestSizes=");
/* 30 */            sb.append(this.I0000Il00O);
/* 35 */            sb.append(", maxFpsForStreamUseCase=");
/* 40 */            sb.append(this.I0000O);
/* 45 */            sb.append(", maxFpsForAllSizes=");
/* 52 */            return Oi010OO0.I001i1lo1io(sb, this.I0000oI00, ')');
                }
            }
