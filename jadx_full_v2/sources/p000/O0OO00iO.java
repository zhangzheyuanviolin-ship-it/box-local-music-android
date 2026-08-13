            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class O0OO00iO {
                public static final O0OO00iO I0000Il00O = new O0OO00iO(0, 127);
                public final int I00000oIO;
                public final int I00000oOI;

                public O0OO00iO(int i, int i2) {
/* 7 */             int i3 = (i2 & 4) != 0 ? 0 : 3;
/* 10 */            i = (i2 & 8) != 0 ? -1 : i;
/* 16 */            this.I00000oIO = i3;
/* 18 */            this.I00000oOI = i;
                }

                public final IoiiO1O1 I00000oIO(boolean z) {
                    IoiiIoIo ioiiIoIo;
/* 5 */             O0OO00ooo1i o0OO00ooo1i = new O0OO00ooo1i();
/* 8 */             int i = this.I00000oIO;
/* 10 */            o0OO00ooo1i.I00000oIO = i;
/* 12 */            VarHandle.storeStoreFence();
/* 16 */            if (i == 0) {
/* 18 */                o0OO00ooo1i = null;
/* 19 */                ioiiIoIo = null;
                    } else {
/* 21 */                ioiiIoIo = null;
                    }
/* 29 */            int i2 = o0OO00ooo1i != null ? o0OO00ooo1i.I00000oIO : 1;
/* 32 */            IoiiIoIo ioiiIoIoI00000oIO = IoiiIoIo.I00000oIO(this.I00000oOI);
/* 39 */            if (ioiiIoIoI00000oIO.I00000oIO == -1) {
/* 41 */                ioiiIoIoI00000oIO = ioiiIoIo;
                    }
/* 53 */            return new IoiiO1O1(z, 0, true, i2, ioiiIoIoI00000oIO != null ? ioiiIoIoI00000oIO.I00000oIO : 1, O11oiiOIl0O.I00iiO);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 23 */                return true;
                    }
/* 6 */             if (!(obj instanceof O0OO00iO)) {
/* 25 */                return false;
                    }
/* 9 */             O0OO00iO o0OO00iO = (O0OO00iO) obj;
                    return this.I00000oIO == o0OO00iO.I00000oIO && this.I00000oOI == o0OO00iO.I00000oOI;
                }

                public final int hashCode() {
/* 20 */            return IIl001iO0Io.I0000O(this.I00000oOI, IIl001iO0Io.I0000O(this.I00000oIO, Integer.hashCode(-1) * 961, 31), 29791);
                }

                public final String toString() {
/* 3 */             String strI00000oIO = O0OO00ooo1i.I00000oIO(this.I00000oIO);
/* 27 */            return IIl001iO0Io.I00100l0(IIl001iO0Io.I00111O("KeyboardOptions(capitalization=", "Unspecified", ", autoCorrectEnabled=null, keyboardType=", strI00000oIO, ", imeAction="), IoiiIoIo.I00000oOI(this.I00000oOI), ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)");
                }
            }
