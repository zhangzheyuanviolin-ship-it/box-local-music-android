            package com.google.ai.edge.gallery.data.local.dao;

            import com.google.ai.edge.gallery.data.local.entities.RagChunkEntity;
            import java.util.List;
            import kotlin.Metadata;
            import p000.IOoil1iiIilo;
            
            @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H§@¢\u0006\u0004\b\n\u0010\u0007J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/google/ai/edge/gallery/data/local/dao/RagChunkDao;", "", "", "Lcom/google/ai/edge/gallery/data/local/entities/RagChunkEntity;", "chunks", "LOoiIlOl1iI;", "insertAll", "(Ljava/util/List;LIOoil1iiIilo;)Ljava/lang/Object;", "", "ids", "getForDocuments", "getAll", "(LIOoil1iiIilo;)Ljava/lang/Object;", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public interface RagChunkDao {
                Object getAll(IOoil1iiIilo iOoil1iiIilo);

                Object getForDocuments(List<String> list, IOoil1iiIilo iOoil1iiIilo);

                Object insertAll(List<RagChunkEntity> list, IOoil1iiIilo iOoil1iiIilo);
            }
