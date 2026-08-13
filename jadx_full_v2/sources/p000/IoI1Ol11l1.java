            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class IoI1Ol11l1 implements O0iOliloIli {
                public Oo0I110i I00000oIO;
                public int I00000oOI;
                public OoI0llll I0000Il00O;
                public IllOOo00lI I0000O;

                @Override
                public final O1iOIo0o0 I0000Il00O(O1iOIoOiO0 o1iOIoOiO0, O1iIo0ll o1iIo0ll, long j) {
                    long j2;
/* 13 */            if (o1iIo0ll.I001iOo1i0O(IOo0oO11ll1O.I000OOo1O(j)) < IOo0oO11ll1O.I000OiO(j)) {
/* 15 */                j2 = j;
                    } else {
/* 25 */                j2 = j;
/* 26 */                j = IOo0oO11ll1O.I0000Il00O(j2, 0, Integer.MAX_VALUE, 0, 0, 13);
                    }
/* 30 */            OO1I0001000i oO1I0001000iI001lllioOl = o1iIo0ll.I001lllioOl(j);
/* 40 */            int iMin = Math.min(oO1I0001000iI001lllioOl.I00iOIl, IOo0oO11ll1O.I000OiO(j2));
/* 44 */            int i = oO1I0001000iI001lllioOl.I00iiI;
/* 49 */            IOli1011IlIo iOli1011IlIo = new IOli1011IlIo(2);
/* 52 */            iOli1011IlIo.I00iiO = this;
/* 54 */            iOli1011IlIo.I00iio = o1iOIoOiO0;
/* 56 */            iOli1011IlIo.I00ilI0I1 = oO1I0001000iI001lllioOl;
/* 58 */            iOli1011IlIo.I00iiI = iMin;
/* 60 */            VarHandle.storeStoreFence();
/* 65 */            return o1iOIoOiO0.I001i1lo1io(iMin, i, Il011I1OiO0I.I00iOIl, iOli1011IlIo);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 48 */                return true;
                    }
/* 7 */             if (obj instanceof IoI1Ol11l1) {
/* 10 */                IoI1Ol11l1 ioI1Ol11l1 = (IoI1Ol11l1) obj;
/* 16 */                if (this.I00000oIO == ioI1Ol11l1.I00000oIO && this.I00000oOI == ioI1Ol11l1.I00000oOI && this.I0000Il00O.equals(ioI1Ol11l1.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, ioI1Ol11l1.I0000O)) {
/* 48 */                    return true;
                        }
                    }
/* 6 */             return false;
                }

                public final int hashCode() {
/* 30 */            return this.I0000O.hashCode() + ((this.I0000Il00O.hashCode() + IIl001iO0Io.I0000O(this.I00000oOI, this.I00000oIO.hashCode() * 31, 31)) * 31);
                }

                public final String toString() {
/* 48 */            return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.I00000oIO + ", cursorOffset=" + this.I00000oOI + ", transformedText=" + this.I0000Il00O + ", textLayoutResultProvider=" + this.I0000O + ")";
                }
            }
