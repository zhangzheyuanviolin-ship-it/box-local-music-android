            package com.google.ai.edge.gallery.data.local.dao;

            import com.google.ai.edge.gallery.data.local.entities.RagDocumentEntity;
            import kotlin.Metadata;
            import p000.IOoil1iiIilo;
            import p000.IlOil1ii;
            
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0006J\u001b\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t0\bH'¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/google/ai/edge/gallery/data/local/dao/RagDocumentDao;", "", "Lcom/google/ai/edge/gallery/data/local/entities/RagDocumentEntity;", "doc", "LOoiIlOl1iI;", "insert", "(Lcom/google/ai/edge/gallery/data/local/entities/RagDocumentEntity;LIOoil1iiIilo;)Ljava/lang/Object;", "delete", "LIlOil1ii;", "", "observeAll", "()LIlOil1ii;", "", "id", "getById", "(Ljava/lang/String;LIOoil1iiIilo;)Ljava/lang/Object;", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public interface RagDocumentDao {
                Object delete(RagDocumentEntity ragDocumentEntity, IOoil1iiIilo iOoil1iiIilo);

                Object getById(String str, IOoil1iiIilo iOoil1iiIilo);

                Object insert(RagDocumentEntity ragDocumentEntity, IOoil1iiIilo iOoil1iiIilo);

                IlOil1ii observeAll();
            }
