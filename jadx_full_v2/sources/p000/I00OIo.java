            package p000;

            import java.util.Enumeration;
            
            public final class I00OIo implements Enumeration {
                public int I00000oIO;
                public I00OOll1 I00000oOI;

                @Override
                public final boolean hasMoreElements() {
                    return this.I00000oIO < this.I00000oOI.I00iOIl.length;
                }

                @Override
                public final Object nextElement() {
/* 1 */             int i = this.I00000oIO;
/* 5 */             I00IO1oi11O[] i00IO1oi11OArr = this.I00000oOI.I00iOIl;
/* 8 */             if (i < i00IO1oi11OArr.length) {
/* 12 */                this.I00000oIO = i + 1;
/* 14 */                return i00IO1oi11OArr[i];
                    }
/* 17 */            IoOOl0iOl1io.I00000oOI();
/* 20 */            return null;
                }
            }
