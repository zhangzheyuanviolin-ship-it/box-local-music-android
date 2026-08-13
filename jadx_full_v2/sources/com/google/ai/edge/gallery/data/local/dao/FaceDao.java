            package com.google.ai.edge.gallery.data.local.dao;

            import com.google.ai.edge.gallery.data.local.entities.FaceRecord;
            import kotlin.Metadata;
            import p000.IOoil1iiIilo;
            
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H§@¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH§@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\nH§@¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\rH§@¢\u0006\u0004\b\u0016\u0010\t¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lcom/google/ai/edge/gallery/data/local/dao/FaceDao;", "", "Lcom/google/ai/edge/gallery/data/local/entities/FaceRecord;", "face", "", "insert", "(Lcom/google/ai/edge/gallery/data/local/entities/FaceRecord;LIOoil1iiIilo;)Ljava/lang/Object;", "", "getAll", "(LIOoil1iiIilo;)Ljava/lang/Object;", "", "oldName", "newName", "LOoiIlOl1iI;", "rename", "(Ljava/lang/String;Ljava/lang/String;LIOoil1iiIilo;)Ljava/lang/Object;", "id", "deleteById", "(JLIOoil1iiIilo;)Ljava/lang/Object;", "name", "deleteByName", "(Ljava/lang/String;LIOoil1iiIilo;)Ljava/lang/Object;", "deleteAll", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public interface FaceDao {
                Object deleteAll(IOoil1iiIilo iOoil1iiIilo);

                Object deleteById(long j, IOoil1iiIilo iOoil1iiIilo);

                Object deleteByName(String str, IOoil1iiIilo iOoil1iiIilo);

                Object getAll(IOoil1iiIilo iOoil1iiIilo);

                Object insert(FaceRecord faceRecord, IOoil1iiIilo iOoil1iiIilo);

                Object rename(String str, String str2, IOoil1iiIilo iOoil1iiIilo);
            }
