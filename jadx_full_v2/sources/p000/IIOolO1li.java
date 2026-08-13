            package p000;

            import android.util.Log;
            import java.io.Closeable;
            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            
            public final class IIOolO1li extends IIOoOiOI implements Closeable {
                public HashMap I00iOIl;
                public HashMap I00iiI;
                public ArrayList I00iiO;
                public IIOoi0ooOoO I00iio;
                public boolean I00ilI0I1;
                public boolean I00ilO0;
                public OiOOiI1lllOo I00io1l;
                public long I00ioIO;

                public final IIi0O10I I00ioIO(IIi0O11lioI1 iIi0O11lioI1) {
/* 1 */             HashMap map = this.I00iOIl;
/* 13 */            IIi0O10I iIi0O10I = iIi0O11lioI1 != null ? (IIi0O10I) map.get(iIi0O11lioI1) : null;
/* 14 */            if (iIi0O10I == null) {
/* 18 */                iIi0O10I = new IIi0O10I(null);
/* 21 */                if (iIi0O11lioI1 != null) {
/* 25 */                    iIi0O10I.I00iiI = iIi0O11lioI1.I00iOIl;
/* 29 */                    iIi0O10I.I00iiO = iIi0O11lioI1.I00iiI;
/* 31 */                    map.put(iIi0O11lioI1, iIi0O10I);
                        }
                    }
/* 49 */            return iIi0O10I;
                }

                @Override
                public final void close() throws IOException {
/* 3 */             if (this.I00ilO0) {
/* 87 */                return;
                    }
/* 17 */            Iterator it = new ArrayList(this.I00iOIl.values()).iterator();
/* 21 */            IOException iOExceptionI00000oIO = null;
/* 28 */            while (it.hasNext()) {
/* 36 */                IIOoOiOI iIOoOiOI = ((IIi0O10I) it.next()).I00iOIl;
/* 40 */                if (iIOoOiOI instanceof IIi0io1lIo) {
/* 44 */                    iOExceptionI00000oIO = io0iolo.I00000oIO((IIi0io1lIo) iIOoOiOI, "COSStream", iOExceptionI00000oIO);
                        }
                    }
/* 51 */            Iterator it2 = this.I00iiO.iterator();
/* 59 */            while (it2.hasNext()) {
/* 67 */                iOExceptionI00000oIO = io0iolo.I00000oIO((IIi0io1lIo) it2.next(), "COSStream", iOExceptionI00000oIO);
                    }
/* 72 */            OiOOiI1lllOo oiOOiI1lllOo = this.I00io1l;
/* 74 */            if (oiOOiI1lllOo != null) {
/* 78 */                iOExceptionI00000oIO = io0iolo.I00000oIO(oiOOiI1lllOo, "ScratchFile", iOExceptionI00000oIO);
                    }
/* 83 */            this.I00ilO0 = true;
/* 85 */            if (iOExceptionI00000oIO != null) {
/* 113 */               throw iOExceptionI00000oIO;
                    }
                }

                public final void finalize() throws IOException {
/* 3 */             if (this.I00ilO0) {
/* 29 */                return;
                    }
/* 7 */             if (this.I00ilI0I1) {
/* 13 */                Log.w("PdfBox-Android", "Warning: You did not close a PDF Document");
                    }
/* 16 */            close();
                }
            }
