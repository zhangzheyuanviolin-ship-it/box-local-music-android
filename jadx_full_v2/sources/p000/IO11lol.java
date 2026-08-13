            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            
            public final class IO11lol implements Iterable, O0IlIoi {
                public char I00iOIl;
                public char I00iiI;
                public int I00iiO = 1;

                static {
/* 5 */             new IO11lol((char) 1, (char) 0);
                }

                public IO11lol(char c, char c2) {
/* 4 */             this.I00iOIl = c;
/* 12 */            this.I00iiI = (char) lIO01iiiOOo.I00000oIO(c, c2, 1);
                }

                public final boolean equals(Object obj) {
/* 1 */             char c = this.I00iiI;
/* 3 */             char c2 = this.I00iOIl;
/* 7 */             if (!(obj instanceof IO11lol)) {
/* 41 */                return false;
                    }
/* 13 */            if (O0000Ioio00.I0000oI00(c2, c) > 0) {
/* 16 */                IO11lol iO11lol = (IO11lol) obj;
/* 26 */                if (O0000Ioio00.I0000oI00(iO11lol.I00iOIl, iO11lol.I00iiI) > 0) {
/* 39 */                    return true;
                        }
                    }
/* 29 */            IO11lol iO11lol2 = (IO11lol) obj;
                    return c2 == iO11lol2.I00iOIl && c == iO11lol2.I00iiI;
                }

                public final int hashCode() {
/* 1 */             char c = this.I00iOIl;
/* 3 */             char c2 = this.I00iiI;
/* 9 */             if (O0000Ioio00.I0000oI00(c, c2) > 0) {
/* 11 */                return -1;
                    }
/* 15 */            return (c * 31) + c2;
                }

                @Override
                public final Iterator iterator() {
/* 3 */             char c = this.I00iOIl;
/* 5 */             char c2 = this.I00iiI;
/* 7 */             int i = this.I00iiO;
/* 9 */             IO11l10l01o iO11l10l01o = new IO11l10l01o();
/* 12 */            iO11l10l01o.I00iOIl = i;
/* 14 */            iO11l10l01o.I00iiI = c2;
/* 16 */            boolean z = false;
/* 18 */            if (i <= 0 ? O0000Ioio00.I0000oI00(c, c2) >= 0 : O0000Ioio00.I0000oI00(c, c2) <= 0) {
/* 26 */                z = true;
                    }
/* 35 */            iO11l10l01o.I00iiO = z;
/* 37 */            if (!z) {
/* 40 */                c = c2;
                    }
/* 41 */            iO11l10l01o.I00iio = c;
/* 43 */            VarHandle.storeStoreFence();
/* 113 */           return iO11l10l01o;
                }

                public final String toString() {
/* 21 */            return this.I00iOIl + ".." + this.I00iiI;
                }
            }
