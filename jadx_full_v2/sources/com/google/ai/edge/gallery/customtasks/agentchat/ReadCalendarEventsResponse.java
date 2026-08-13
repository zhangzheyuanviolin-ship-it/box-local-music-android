            package com.google.ai.edge.gallery.customtasks.agentchat;

            import java.util.List;
            import kotlin.Metadata;
            import p000.O0000Ioio00;
            import p000.O01III;
            
            @O01III(generateAdapter = true)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/google/ai/edge/gallery/customtasks/agentchat/ReadCalendarEventsResponse;", "", "events", "", "Lcom/google/ai/edge/gallery/customtasks/agentchat/CalendarEventDto;", "<init>", "(Ljava/util/List;)V", "getEvents", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class ReadCalendarEventsResponse {
                public static final int $stable = 8;
                private final List<CalendarEventDto> events;

                public ReadCalendarEventsResponse(List<CalendarEventDto> list) {
/* 4 */             this.events = list;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static ReadCalendarEventsResponse copy$default(ReadCalendarEventsResponse readCalendarEventsResponse, List list, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 list = readCalendarEventsResponse.events;
                    }
/* 7 */             return readCalendarEventsResponse.copy(list);
                }

                public final List<CalendarEventDto> component1() {
/* 1 */             return this.events;
                }

                public final ReadCalendarEventsResponse copy(List<CalendarEventDto> events) {
/* 3 */             return new ReadCalendarEventsResponse(events);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
                    return (other instanceof ReadCalendarEventsResponse) && O0000Ioio00.I0000O(this.events, ((ReadCalendarEventsResponse) other).events);
                }

                public final List<CalendarEventDto> getEvents() {
/* 1 */             return this.events;
                }

                public int hashCode() {
/* 3 */             return this.events.hashCode();
                }

                public String toString() {
/* 18 */            return "ReadCalendarEventsResponse(events=" + this.events + ")";
                }
            }
