            package p000;

            import java.io.EOFException;
            import java.io.IOException;
            
            public final class IlII1io extends Ill00IiiOIiO {
                public I10iOo0il1 I00iOIl;
                public boolean I00iiI;

                @Override
                public final void close() {
                    try {
/* 1 */                 super.close();
                    } catch (IOException e) {
/* 7 */                 this.I00iiI = true;
/* 11 */                this.I00iOIl.invoke(e);
                    }
                }

                @Override
                public final void flush() {
                    try {
/* 1 */                 super.flush();
                    } catch (IOException e) {
/* 7 */                 this.I00iiI = true;
/* 11 */                this.I00iOIl.invoke(e);
                    }
                }

                @Override
                public final void write(III1o0lOio0 iII1o0lOio0, long j) throws EOFException {
/* 3 */             if (this.I00iiI) {
/* 5 */                 iII1o0lOio0.skip(j);
/* 8 */                 return;
                    }
                    try {
/* 9 */                 super.write(iII1o0lOio0, j);
                    } catch (IOException e) {
/* 15 */                this.I00iiI = true;
/* 19 */                this.I00iOIl.invoke(e);
                    }
                }
            }
