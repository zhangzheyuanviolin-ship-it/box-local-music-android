            package p000;

            import java.util.ArrayList;
            
            public final class OO1il1IIii {
                public long I00000oIO;
                public long I00000oOI;
                public long I0000Il00O;
                public long I0000O;
                public boolean I0000oI00;
                public float I0001Ioi1lo;
                public int I000II;
                public boolean I000O01llI0;
                public ArrayList I000OOo1O;
                public long I000OiO;
                public float I000iOII;
                public long I000l1;
                public long I000lI;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 144 */               return true;
                    }
/* 7 */             if (!(obj instanceof OO1il1IIii)) {
/* 146 */               return false;
                    }
/* 11 */            OO1il1IIii oO1il1IIii = (OO1il1IIii) obj;
                    return lI1ioiO0.I00000oIO(this.I00000oIO, oO1il1IIii.I00000oIO) && this.I00000oOI == oO1il1IIii.I00000oOI && OIOlIiiioi.I0000O(this.I0000Il00O, oO1il1IIii.I0000Il00O) && OIOlIiiioi.I0000O(this.I0000O, oO1il1IIii.I0000O) && this.I0000oI00 == oO1il1IIii.I0000oI00 && Float.compare(this.I0001Ioi1lo, oO1il1IIii.I0001Ioi1lo) == 0 && this.I000II == oO1il1IIii.I000II && this.I000O01llI0 == oO1il1IIii.I000O01llI0 && this.I000OOo1O.equals(oO1il1IIii.I000OOo1O) && OIOlIiiioi.I0000O(this.I000OiO, oO1il1IIii.I000OiO) && Float.compare(this.I000iOII, oO1il1IIii.I000iOII) == 0 && OIOlIiiioi.I0000O(this.I000l1, oO1il1IIii.I000l1) && OIOlIiiioi.I0000O(this.I000lI, oO1il1IIii.I000lI);
                }

                public final int hashCode() {
/* 84 */            return Long.hashCode(this.I000lI) + IIlIOloOOO.I0000O(this.I000l1, OooioIOo1.I0000O(IIlIOloOOO.I0000O(this.I000OiO, (this.I000OOo1O.hashCode() + Oi010OO0.I000OOo1O(IIl001iO0Io.I0000O(this.I000II, OooioIOo1.I0000O(Oi010OO0.I000OOo1O(IIlIOloOOO.I0000O(this.I0000O, IIlIOloOOO.I0000O(this.I0000Il00O, IIlIOloOOO.I0000O(this.I00000oOI, Long.hashCode(this.I00000oIO) * 31, 31), 31), 31), 31, this.I0000oI00), 31, this.I0001Ioi1lo), 31), 31, this.I000O01llI0)) * 31, 31), 31, this.I000iOII), 31);
                }

                public final String toString() {
/* 3 */             String strI00000oOI = lI1ioiO0.I00000oOI(this.I00000oIO);
/* 7 */             long j = this.I00000oOI;
/* 11 */            String strI000OOo1O = OIOlIiiioi.I000OOo1O(this.I0000Il00O);
/* 17 */            String strI000OOo1O2 = OIOlIiiioi.I000OOo1O(this.I0000O);
/* 21 */            boolean z = this.I0000oI00;
/* 23 */            float f = this.I0001Ioi1lo;
/* 27 */            String strI00000oIO = OO1l0oO.I00000oIO(this.I000II);
/* 31 */            boolean z2 = this.I000O01llI0;
/* 33 */            ArrayList arrayList = this.I000OOo1O;
/* 37 */            String strI000OOo1O3 = OIOlIiiioi.I000OOo1O(this.I000OiO);
/* 41 */            float f2 = this.I000iOII;
/* 45 */            String strI000OOo1O4 = OIOlIiiioi.I000OOo1O(this.I000l1);
/* 51 */            String strI000OOo1O5 = OIOlIiiioi.I000OOo1O(this.I000lI);
/* 59 */            StringBuilder sb = new StringBuilder("PointerInputEventData(id=");
/* 62 */            sb.append(strI00000oOI);
/* 67 */            sb.append(", uptime=");
/* 70 */            sb.append(j);
/* 77 */            IIl001iO0Io.I001lIiIIo1O(sb, ", positionOnScreen=", strI000OOo1O, ", position=", strI000OOo1O2);
/* 82 */            sb.append(", down=");
/* 85 */            sb.append(z);
/* 90 */            sb.append(", pressure=");
/* 93 */            sb.append(f);
/* 98 */            sb.append(", type=");
/* 101 */           sb.append(strI00000oIO);
/* 106 */           sb.append(", activeHover=");
/* 109 */           sb.append(z2);
/* 114 */           sb.append(", historical=");
/* 117 */           sb.append(arrayList);
/* 122 */           sb.append(", scrollDelta=");
/* 125 */           sb.append(strI000OOo1O3);
/* 130 */           sb.append(", scaleGestureFactor=");
/* 133 */           sb.append(f2);
/* 138 */           sb.append(", panGestureOffset=");
/* 141 */           sb.append(strI000OOo1O4);
/* 148 */           return IIlIOloOOO.I0010I0i(sb, ", originalEventPosition=", strI000OOo1O5, ")");
                }
            }
