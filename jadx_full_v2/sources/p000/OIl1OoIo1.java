            package p000;
            
            public final class OIl1OoIo1 {
                public boolean I00000oIO;
                public long I00000oOI;
                public long I0000Il00O;
                public long I0000O;
                public long I0000oI00;
                public OIl1Oll I0001Ioi1lo;
                public I1Ool1IoO110 I000II;

                public final void I00000oIO(long j, Object obj) {
/* 7 */             if (this.I000II.I00000oIO()) {
/* 11 */                this.I0001Ioi1lo.I00000oOI(obj);
/* 14 */                return;
                    }
/* 19 */            StringBuilder sb = new StringBuilder("Output ");
/* 24 */            sb.append(this.I0000O);
/* 29 */            sb.append(" at ");
/* 38 */            sb.append((Object) IllIiOlOoIll.I00000oIO(this.I00000oOI));
/* 43 */            sb.append(" for ");
/* 52 */            IOOlIIilOl0.I0000oI00(IlIi0I0.I000o00OoI0I(sb, j, " was completed multiple times!"));
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 64 */                return true;
                    }
/* 7 */             if (obj instanceof OIl1OoIo1) {
/* 10 */                OIl1OoIo1 oIl1OoIo1 = (OIl1OoIo1) obj;
/* 16 */                if (this.I00000oIO == oIl1OoIo1.I00000oIO && this.I00000oOI == oIl1OoIo1.I00000oOI && this.I0000Il00O == oIl1OoIo1.I0000Il00O && this.I0000O == oIl1OoIo1.I0000O && this.I0000oI00 == oIl1OoIo1.I0000oI00 && O0000Ioio00.I0000O(this.I0001Ioi1lo, oIl1OoIo1.I0001Ioi1lo)) {
/* 64 */                    return true;
                        }
                    }
/* 6 */             return false;
                }

                public final int hashCode() {
/* 40 */            return this.I0001Ioi1lo.hashCode() + IIlIOloOOO.I0000O(this.I0000oI00, IIlIOloOOO.I0000O(this.I0000O, IIlIOloOOO.I0000O(this.I0000Il00O, IIlIOloOOO.I0000O(this.I00000oOI, Boolean.hashCode(this.I00000oIO) * 31, 31), 31), 31), 31);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("StartedOutput(isOutOfOrder=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", cameraFrameNumber=");
/* 24 */            sb.append((Object) IllIiOlOoIll.I00000oIO(this.I00000oOI));
/* 29 */            sb.append(", cameraTimestamp=");
/* 53 */            sb.append((Object) ("CameraTimestamp(value=" + this.I0000Il00O + ')'));
/* 58 */            sb.append(", cameraOutputSequence=");
/* 63 */            sb.append(this.I0000O);
/* 68 */            sb.append(", cameraOutputNumber=");
/* 73 */            sb.append(this.I0000oI00);
/* 78 */            sb.append(", outputListener=");
/* 83 */            sb.append(this.I0001Ioi1lo);
/* 86 */            sb.append(')');
/* 89 */            return sb.toString();
                }
            }
