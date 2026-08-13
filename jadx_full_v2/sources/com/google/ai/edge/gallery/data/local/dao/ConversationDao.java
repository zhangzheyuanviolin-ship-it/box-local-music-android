            package com.google.ai.edge.gallery.data.local.dao;

            import com.google.ai.edge.gallery.data.local.entities.Conversation;
            import kotlin.Metadata;
            import p000.IOoil1iiIilo;
            import p000.IlOil1ii;
            
            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H§@¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\r\u001a\u00020\tH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\tH§@¢\u0006\u0004\b\u0011\u0010\fJ\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0016\u0010\u0015J\u0018\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0018\u0010\b¨\u0006\u0019À\u0006\u0003"}, d2 = {"Lcom/google/ai/edge/gallery/data/local/dao/ConversationDao;", "", "LIlOil1ii;", "", "Lcom/google/ai/edge/gallery/data/local/entities/Conversation;", "getAllConversations", "()LIlOil1ii;", "getAllConversationsSync", "(LIOoil1iiIilo;)Ljava/lang/Object;", "", "id", "getConversationById", "(Ljava/lang/String;LIOoil1iiIilo;)Ljava/lang/Object;", "taskType", "getConversationsByTask", "(Ljava/lang/String;)LIlOil1ii;", "modelName", "getLatestForModel", "conversation", "LOoiIlOl1iI;", "insert", "(Lcom/google/ai/edge/gallery/data/local/entities/Conversation;LIOoil1iiIilo;)Ljava/lang/Object;", "update", "delete", "deleteAll", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public interface ConversationDao {
                Object delete(Conversation conversation, IOoil1iiIilo iOoil1iiIilo);

                Object deleteAll(IOoil1iiIilo iOoil1iiIilo);

                IlOil1ii getAllConversations();

                Object getAllConversationsSync(IOoil1iiIilo iOoil1iiIilo);

                Object getConversationById(String str, IOoil1iiIilo iOoil1iiIilo);

                IlOil1ii getConversationsByTask(String taskType);

                Object getLatestForModel(String str, IOoil1iiIilo iOoil1iiIilo);

                Object insert(Conversation conversation, IOoil1iiIilo iOoil1iiIilo);

                Object update(Conversation conversation, IOoil1iiIilo iOoil1iiIilo);
            }
