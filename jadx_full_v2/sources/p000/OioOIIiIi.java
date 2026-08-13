            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LOioOIIiIi;", "LO1oooooIio;", "LII0oOiiIO;", "ui"}, m18k = 1, mv = {2, 1, 0}, xi = 48)
            public final class OioOIIiIi extends O1oooooIio {
                public float I00000oIO;
                public OiI111I I00000oOI;
                public boolean I0000Il00O;
                public long I0000O;
                public long I0000oI00;

                @Override
                public final O1ooOo I000II() {
/* 7 */             OIoO1Ol oIoO1Ol = new OIoO1Ol(26);
/* 10 */            oIoO1Ol.I00iiI = this;
/* 12 */            VarHandle.storeStoreFence();
/* 15 */            return new II0oOiiIO(oIoO1Ol);
                }

                @Override
                public final void I000O01llI0(O1ooOo o1ooOo) {
/* 1 */             II0oOiiIO iI0oOiiIO = (II0oOiiIO) o1ooOo;
/* 7 */             OIoO1Ol oIoO1Ol = new OIoO1Ol(26);
/* 10 */            oIoO1Ol.I00iiI = this;
/* 12 */            VarHandle.storeStoreFence();
/* 15 */            iI0oOiiIO.I00o0iI0io1 = oIoO1Ol;
/* 17 */            l0o11Oi.I0000Il00O(iI0oOiiIO, oIoO1Ol);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 65 */                return true;
                    }
/* 6 */             if (!(obj instanceof OioOIIiIi)) {
/* 63 */                return false;
                    }
/* 9 */             OioOIIiIi oioOIIiIi = (OioOIIiIi) obj;
/* 19 */            if (!Iil1010O.I0000Il00O(this.I00000oIO, oioOIIiIi.I00000oIO) || !O0000Ioio00.I0000O(this.I00000oOI, oioOIIiIi.I00000oOI) || this.I0000Il00O != oioOIIiIi.I0000Il00O) {
/* 63 */                return false;
                    }
/* 40 */            long j = this.I0000O;
/* 42 */            long j2 = oioOIIiIi.I0000O;
/* 44 */            int i = IOOiio0i.I000oI1ioi;
                    return Ooi0i1.I00000oOI(j, j2) && Ooi0i1.I00000oOI(this.I0000oI00, oioOIIiIi.I0000oI00);
                }

                public final int hashCode() {
/* 20 */            int iI000OOo1O = Oi010OO0.I000OOo1O((this.I00000oOI.hashCode() + (Float.hashCode(this.I00000oIO) * 31)) * 31, 31, this.I0000Il00O);
/* 24 */            long j = this.I0000O;
/* 26 */            int i = IOOiio0i.I000oI1ioi;
/* 38 */            return Long.hashCode(this.I0000oI00) + IIlIOloOOO.I0000O(j, iI000OOo1O, 31);
                }

                public final String toString() {
/* 3 */             String strI0000O = Iil1010O.I0000O(this.I00000oIO);
/* 7 */             OiI111I oiI111I = this.I00000oOI;
/* 9 */             boolean z = this.I0000Il00O;
/* 13 */            String strI000OOo1O = IOOiio0i.I000OOo1O(this.I0000O);
/* 19 */            String strI000OOo1O2 = IOOiio0i.I000OOo1O(this.I0000oI00);
/* 27 */            StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
/* 30 */            sb.append(strI0000O);
/* 35 */            sb.append(", shape=");
/* 38 */            sb.append(oiI111I);
/* 43 */            sb.append(", clip=");
/* 46 */            sb.append(z);
/* 51 */            sb.append(", ambientColor=");
/* 54 */            sb.append(strI000OOo1O);
/* 59 */            sb.append(", spotColor=");
/* 64 */            return IIl001iO0Io.I00100l0(sb, strI000OOo1O2, ")");
                }
            }
