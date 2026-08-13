            package p000;

            import com.google.ai.edge.gallery.data.local.dao.RagChunkDao;
            import com.google.ai.edge.gallery.data.local.dao.RagDocumentDao;
            import com.google.ai.edge.gallery.data.local.entities.RagDocumentEntity;
            
            public final class OOiool1 {
                public OOl0lll0li0 I00000oIO;
                public Oo0oIo00ioo I00000oOI;
                public RagDocumentDao I0000Il00O;
                public RagChunkDao I0000O;

                /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
                
                    if (r0.delete(r5, r1) == r7) goto L23;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oIO(String str, IOoilo iOoilo) throws Throwable {
                    OOioi11oo0I oOioi11oo0I;
/* 1 */             RagDocumentDao ragDocumentDao = this.I0000Il00O;
/* 5 */             if (iOoilo instanceof OOioi11oo0I) {
/* 8 */                 oOioi11oo0I = (OOioi11oo0I) iOoilo;
/* 10 */                int i = oOioi11oo0I.I00iiO;
/* 16 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 19 */                    oOioi11oo0I.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 24 */                    oOioi11oo0I = new OOioi11oo0I(this, iOoilo);
                        }
                    }
/* 27 */            Object byId = oOioi11oo0I.I00iOIl;
/* 29 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 31 */            int i2 = oOioi11oo0I.I00iiO;
/* 35 */            if (i2 == 0) {
/* 56 */                lIoii1l01l0i.I00000oOI(byId);
/* 59 */                oOioi11oo0I.I00iiO = 1;
/* 61 */                byId = ragDocumentDao.getById(str, oOioi11oo0I);
/* 65 */                if (byId != ii0111o) {
                        }
/* 80 */                return ii0111o;
                    }
/* 37 */            if (i2 != 1) {
/* 39 */                if (i2 == 2) {
/* 41 */                    lIoii1l01l0i.I00000oOI(byId);
/* 81 */                    return OoiIlOl1iI.I00000oIO;
                        }
/* 47 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 50 */                return null;
                    }
/* 52 */            lIoii1l01l0i.I00000oOI(byId);
/* 68 */            RagDocumentEntity ragDocumentEntity = (RagDocumentEntity) byId;
/* 70 */            if (ragDocumentEntity != null) {
/* 72 */                oOioi11oo0I.I00iiO = 2;
                    }
/* 81 */            return OoiIlOl1iI.I00000oIO;
                }
            }
