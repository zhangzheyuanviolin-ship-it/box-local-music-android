            package p000;

            import android.content.Context;
            import java.io.IOException;
            
            public final class IllOI1IoO implements Olil10OiIi1l {
                public Context I00iOIl;
                public String I00iiI;
                public O1I1OO I00iiO;
                public boolean I00iio;
                public boolean I00ilI0I1;
                public OllO00oiil I00ilO0;
                public boolean I00io1l;

                @Override
                public final Olil0l0 I00Oio() {
/* 10 */            return ((IllOI010l) this.I00ilO0.getValue()).I00000oIO(true);
                }

                @Override
                public final void close() throws IOException {
/* 1 */             OllO00oiil ollO00oiil = this.I00ilO0;
/* 7 */             if (ollO00oiil.I00000oOI()) {
/* 15 */                ((IllOI010l) ollO00oiil.getValue()).close();
                    }
                }

                @Override
                public final String getDatabaseName() {
/* 1 */             return this.I00iiI;
                }

                @Override
                public final void setWriteAheadLoggingEnabled(boolean z) {
/* 1 */             OllO00oiil ollO00oiil = this.I00ilO0;
/* 7 */             if (ollO00oiil.I00000oOI()) {
/* 15 */                ((IllOI010l) ollO00oiil.getValue()).setWriteAheadLoggingEnabled(z);
                    }
/* 18 */            this.I00io1l = z;
                }
            }
