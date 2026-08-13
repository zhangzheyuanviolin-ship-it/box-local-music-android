            package p000;

            import java.io.IOException;
            
            public final class IoI1Iii extends OlliIl0 {
                public int[] I0001Ioi1lo;
                public short[] I000II;
                public short[] I000O01llI0;
                public int I000OOo1O;

                @Override
                public final void I00000oIO(OoIllIioi1l ooIllIioi1l, IoiOloi ioiOloi) throws IOException {
                    int i;
/* 7 */             IoI1IIo00Io1 ioI1IIo00Io1 = (IoI1IIo00Io1) ooIllIioi1l.I00IOO("hhea");
/* 9 */             if (ioI1IIo00Io1 == null) {
/* 102 */               IioIoO10iOiI.I000OOo1O("Could not get hmtx table");
/* 551 */               return;
                    }
/* 13 */            this.I000OOo1O = ioI1IIo00Io1.I0001Ioi1lo;
/* 15 */            int iI001l0I00 = ooIllIioi1l.I001l0I00();
/* 19 */            int i2 = this.I000OOo1O;
/* 23 */            this.I0001Ioi1lo = new int[i2];
/* 27 */            this.I000II = new short[i2];
/* 30 */            int i3 = 0;
/* 31 */            int i4 = 0;
                    while (true) {
/* 32 */                i = this.I000OOo1O;
/* 34 */                if (i3 >= i) {
                            break;
                        }
/* 42 */                this.I0001Ioi1lo[i3] = ioiOloi.I00OIl();
/* 50 */                this.I000II[i3] = ioiOloi.I00IioO0OiOi();
/* 52 */                i4 += 4;
/* 54 */                i3++;
                    }
/* 57 */            int i5 = iI001l0I00 - i;
/* 59 */            if (i5 >= 0) {
/* 62 */                iI001l0I00 = i5;
                    }
/* 65 */            this.I000O01llI0 = new short[iI001l0I00];
/* 72 */            if (i4 < this.I0000Il00O) {
/* 74 */                for (int i6 = 0; i6 < iI001l0I00; i6++) {
/* 81 */                    if (i4 < this.I0000Il00O) {
/* 89 */                        this.I000O01llI0[i6] = ioiOloi.I00IioO0OiOi();
/* 91 */                        i4 += 2;
                            }
                        }
                    }
/* 97 */            this.I0000O = true;
                }
            }
