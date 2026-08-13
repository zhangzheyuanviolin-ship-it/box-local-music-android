            package com.google.ai.edge.gallery.data.local;

            import com.google.ai.edge.gallery.data.local.dao.ConversationDao;
            import com.google.ai.edge.gallery.data.local.dao.FaceDao;
            import com.google.ai.edge.gallery.data.local.dao.MessageDao;
            import com.google.ai.edge.gallery.data.local.dao.RagChunkDao;
            import com.google.ai.edge.gallery.data.local.dao.RagDocumentDao;
            import kotlin.Metadata;
            import p000.O1loO1i0IoO;
            import p000.Oi1oIiOiIi0;
            import p000.i1O01oOIoI0I;
            
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/google/ai/edge/gallery/data/local/BoxChatDatabase;", "LOi1oIiOiIi0;", "<init>", "()V", "i1O01oOIoI0I", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public abstract class BoxChatDatabase extends Oi1oIiOiIi0 {
                public static final i1O01oOIoI0I I000l1 = new i1O01oOIoI0I(9);
                public static final O1loO1i0IoO I000lI = new O1loO1i0IoO(1, 2, 10);
                public static final O1loO1i0IoO I000o00OoI0I = new O1loO1i0IoO(2, 3, 11);
                public static final O1loO1i0IoO I000oI1ioi = new O1loO1i0IoO(3, 4, 12);
                public static final O1loO1i0IoO I00100l0 = new O1loO1i0IoO(4, 5, 13);
                public static volatile BoxChatDatabase I00100o1O0lo;

                public abstract ConversationDao I001IIilI0O();

                public abstract FaceDao I001IO000();

                public abstract MessageDao I001i1O0Ol();

                public abstract RagChunkDao I001i1lo1io();

                public abstract RagDocumentDao I001iOo1i0O();
            }
