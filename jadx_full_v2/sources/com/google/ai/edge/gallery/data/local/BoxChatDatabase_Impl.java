            package com.google.ai.edge.gallery.data.local;

            import com.google.ai.edge.gallery.data.local.dao.ConversationDao;
            import com.google.ai.edge.gallery.data.local.dao.FaceDao;
            import com.google.ai.edge.gallery.data.local.dao.MessageDao;
            import com.google.ai.edge.gallery.data.local.dao.RagChunkDao;
            import com.google.ai.edge.gallery.data.local.dao.RagDocumentDao;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Set;
            import kotlin.Metadata;
            import p000.II1oI0O;
            import p000.II1oIiIOOo;
            import p000.IioliO10l;
            import p000.Il01100l;
            import p000.O00IOI11;
            import p000.O0IOli0o0;
            import p000.OOoOl0i;
            import p000.OOoOl1001II;
            import p000.OllO00oiil;
            
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/ai/edge/gallery/data/local/BoxChatDatabase_Impl;", "Lcom/google/ai/edge/gallery/data/local/BoxChatDatabase;", "<init>", "()V", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class BoxChatDatabase_Impl extends BoxChatDatabase {
                public final OllO00oiil I0010I0i;
                public final OllO00oiil I0010o;
                public final OllO00oiil I00111O;
                public final OllO00oiil I001IIilI0O;
                public final OllO00oiil I001IO000;

                public BoxChatDatabase_Impl() {
/* 7 */             II1oI0O iI1oI0O = new II1oI0O(0);
/* 10 */            iI1oI0O.I00iiI = this;
/* 12 */            VarHandle.storeStoreFence();
/* 20 */            this.I0010I0i = new OllO00oiil(iI1oI0O);
/* 25 */            II1oI0O iI1oI0O2 = new II1oI0O(1);
/* 28 */            iI1oI0O2.I00iiI = this;
/* 30 */            VarHandle.storeStoreFence();
/* 38 */            this.I0010o = new OllO00oiil(iI1oI0O2);
/* 43 */            II1oI0O iI1oI0O3 = new II1oI0O(2);
/* 46 */            iI1oI0O3.I00iiI = this;
/* 48 */            VarHandle.storeStoreFence();
/* 56 */            this.I00111O = new OllO00oiil(iI1oI0O3);
/* 61 */            II1oI0O iI1oI0O4 = new II1oI0O(3);
/* 64 */            iI1oI0O4.I00iiI = this;
/* 66 */            VarHandle.storeStoreFence();
/* 74 */            this.I001IIilI0O = new OllO00oiil(iI1oI0O4);
/* 79 */            II1oI0O iI1oI0O5 = new II1oI0O(4);
/* 82 */            iI1oI0O5.I00iiI = this;
/* 84 */            VarHandle.storeStoreFence();
/* 92 */            this.I001IO000 = new OllO00oiil(iI1oI0O5);
                }

                @Override
                public final List I0000Il00O(LinkedHashMap linkedHashMap) {
/* 3 */             return new ArrayList();
                }

                @Override
                public final O00IOI11 I0000O() {
/* 27 */            return new O00IOI11(this, new LinkedHashMap(), new LinkedHashMap(), "conversations", "messages", "rag_documents", "rag_chunks", "faces");
                }

                @Override
                public final IioliO10l I0000oI00() {
/* 3 */             return new II1oIiIOOo(this);
                }

                @Override
                public final Set I000OOo1O() {
/* 3 */             return new LinkedHashSet();
                }

                @Override
                public final LinkedHashMap I000OiO() {
/* 3 */             LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 6 */             OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 10 */            O0IOli0o0 o0IOli0o0I00000oOI = oOoOl1001II.I00000oOI(ConversationDao.class);
/* 14 */            Il01100l il01100l = Il01100l.I00iOIl;
/* 16 */            linkedHashMap.put(o0IOli0o0I00000oOI, il01100l);
/* 25 */            linkedHashMap.put(oOoOl1001II.I00000oOI(MessageDao.class), il01100l);
/* 34 */            linkedHashMap.put(oOoOl1001II.I00000oOI(RagDocumentDao.class), il01100l);
/* 43 */            linkedHashMap.put(oOoOl1001II.I00000oOI(RagChunkDao.class), il01100l);
/* 52 */            linkedHashMap.put(oOoOl1001II.I00000oOI(FaceDao.class), il01100l);
/* 55 */            return linkedHashMap;
                }

                @Override
                public final ConversationDao I001IIilI0O() {
/* 7 */             return (ConversationDao) this.I0010I0i.getValue();
                }

                @Override
                public final FaceDao I001IO000() {
/* 7 */             return (FaceDao) this.I001IO000.getValue();
                }

                @Override
                public final MessageDao I001i1O0Ol() {
/* 7 */             return (MessageDao) this.I0010o.getValue();
                }

                @Override
                public final RagChunkDao I001i1lo1io() {
/* 7 */             return (RagChunkDao) this.I001IIilI0O.getValue();
                }

                @Override
                public final RagDocumentDao I001iOo1i0O() {
/* 7 */             return (RagDocumentDao) this.I00111O.getValue();
                }
            }
