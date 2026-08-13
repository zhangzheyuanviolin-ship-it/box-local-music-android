            package com.google.ai.edge.gallery.data.local.dao;

            import com.google.ai.edge.gallery.data.local.entities.Message;
            import java.util.List;
            import kotlin.Metadata;
            import p000.IOoil1iiIilo;
            import p000.IlOil1ii;
            
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006H§@¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0010\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H§@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006H§@¢\u0006\u0004\b\u0012\u0010\u000eJ\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0013\u0010\n¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/google/ai/edge/gallery/data/local/dao/MessageDao;", "", "", "conversationId", "LIlOil1ii;", "", "Lcom/google/ai/edge/gallery/data/local/entities/Message;", "getMessagesForConversation", "(Ljava/lang/String;)LIlOil1ii;", "getMessagesForConversationSync", "(Ljava/lang/String;LIOoil1iiIilo;)Ljava/lang/Object;", "message", "LOoiIlOl1iI;", "insert", "(Lcom/google/ai/edge/gallery/data/local/entities/Message;LIOoil1iiIilo;)Ljava/lang/Object;", "messages", "insertAll", "(Ljava/util/List;LIOoil1iiIilo;)Ljava/lang/Object;", "delete", "deleteAllForConversation", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public interface MessageDao {
                Object delete(Message message, IOoil1iiIilo iOoil1iiIilo);

                Object deleteAllForConversation(String str, IOoil1iiIilo iOoil1iiIilo);

                IlOil1ii getMessagesForConversation(String conversationId);

                Object getMessagesForConversationSync(String str, IOoil1iiIilo iOoil1iiIilo);

                Object insert(Message message, IOoil1iiIilo iOoil1iiIilo);

                Object insertAll(List<Message> list, IOoil1iiIilo iOoil1iiIilo);
            }
