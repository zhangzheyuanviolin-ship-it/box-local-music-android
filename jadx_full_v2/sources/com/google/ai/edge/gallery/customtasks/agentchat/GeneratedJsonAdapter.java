            package com.google.ai.edge.gallery.customtasks.agentchat;

            import java.util.List;
            import kotlin.Metadata;
            import p000.IOOlIIilOl0;
            import p000.Il01llIol0;
            import p000.O011ioiO1OI;
            import p000.O01lo1il;
            import p000.O01ooIO00oio;
            import p000.OI011oo1;
            import p000.OoOllol1Io1;
            import p000.Ooll10OlIOl0;
            
            @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/google/ai/edge/gallery/customtasks/agentchat/ReadCalendarEventsResponseJsonAdapter;", "LO011ioiO1OI;", "Lcom/google/ai/edge/gallery/customtasks/agentchat/ReadCalendarEventsResponse;", "LOI011oo1;", "moshi", "<init>", "(LOI011oo1;)V", "", "toString", "()Ljava/lang/String;", "LO01lo1il;", "reader", "fromJson", "(LO01lo1il;)Lcom/google/ai/edge/gallery/customtasks/agentchat/ReadCalendarEventsResponse;", "LO01ooIO00oio;", "writer", "value_", "LOoiIlOl1iI;", "toJson", "(LO01ooIO00oio;Lcom/google/ai/edge/gallery/customtasks/agentchat/ReadCalendarEventsResponse;)V", "LO01lo1il$I00000oIO;", "options", "LO01lo1il$I00000oIO;", "", "Lcom/google/ai/edge/gallery/customtasks/agentchat/CalendarEventDto;", "listOfCalendarEventDtoAdapter", "LO011ioiO1OI;", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class GeneratedJsonAdapter extends O011ioiO1OI {
                public static final int $stable = 8;
                private final O011ioiO1OI listOfCalendarEventDtoAdapter;
                private final O01lo1il.I00000oIO options = O01lo1il.I00000oIO.of("events");

                public GeneratedJsonAdapter(OI011oo1 oI011oo1) {
/* 36 */            this.listOfCalendarEventDtoAdapter = oI011oo1.adapter(OoOllol1Io1.newParameterizedType(List.class, CalendarEventDto.class), Il01llIol0.I00iOIl, "events");
                }

                @Override
                public ReadCalendarEventsResponse fromJson(O01lo1il reader) {
/* 1 */             reader.beginObject();
/* 4 */             List list = null;
/* 11 */            while (reader.hasNext()) {
/* 15 */                int iSelectName = reader.selectName(this.options);
/* 20 */                if (iSelectName == -1) {
/* 41 */                    reader.skipName();
/* 44 */                    reader.skipValue();
                        } else if (iSelectName == 0 && (list = (List) this.listOfCalendarEventDtoAdapter.fromJson(reader)) == null) {
/* 40 */                    throw Ooll10OlIOl0.unexpectedNull("events", "events", reader);
                        }
                    }
/* 48 */            reader.endObject();
/* 53 */            if (list != null) {
/* 55 */                return new ReadCalendarEventsResponse(list);
                    }
/* 77 */            throw Ooll10OlIOl0.missingProperty("events", "events", reader);
                }

                @Override
                public void toJson(O01ooIO00oio writer, ReadCalendarEventsResponse value_) {
/* 1 */             if (value_ == null) {
/* 26 */                IOOlIIilOl0.I000II("value_ was null! Wrap in .nullSafe() to write nullable values.");
/* 37 */                return;
                    }
/* 3 */             writer.beginObject();
/* 8 */             writer.name("events");
/* 17 */            this.listOfCalendarEventDtoAdapter.toJson(writer, value_.getEvents());
/* 20 */            writer.endObject();
                }

                public String toString() {
/* 5 */             StringBuilder sb = new StringBuilder(48);
/* 10 */            sb.append("GeneratedJsonAdapter(ReadCalendarEventsResponse)");
/* 13 */            return sb.toString();
                }
            }
