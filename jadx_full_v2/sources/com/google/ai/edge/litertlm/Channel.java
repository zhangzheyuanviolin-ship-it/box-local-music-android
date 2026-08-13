            package com.google.ai.edge.litertlm;

            import kotlin.Metadata;
            import p000.IIl001iO0Io;
            import p000.O0000Ioio00;
            import p000.O01l0lO0li;
            import p000.Oi010OO0;
            
            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\r¨\u0006\u001e"}, d2 = {"Lcom/google/ai/edge/litertlm/Channel;", "", "", "channelName", "start", "end", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "LO01l0lO0li;", "toJson$third_party_odml_litert_lm_kotlin_java_com_google_ai_edge_litertlm_litertlm_android", "()LO01l0lO0li;", "toJson", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/google/ai/edge/litertlm/Channel;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getChannelName", "getStart", "getEnd", "third_party.odml.litert_lm.kotlin.java.com.google.ai.edge.litertlm_litertlm-android"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class Channel {
                private final String channelName;
                private final String end;
                private final String start;

                public Channel(String str, String str2, String str3) {
/* 4 */             this.channelName = str;
/* 6 */             this.start = str2;
/* 8 */             this.end = str3;
                }

                public static Channel copy$default(Channel channel, String str, String str2, String str3, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 str = channel.channelName;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                str2 = channel.start;
                    }
/* 15 */            if ((i & 4) != 0) {
/* 17 */                str3 = channel.end;
                    }
/* 19 */            return channel.copy(str, str2, str3);
                }

                public final String getChannelName() {
/* 1 */             return this.channelName;
                }

                public final String getStart() {
/* 1 */             return this.start;
                }

                public final String getEnd() {
/* 1 */             return this.end;
                }

                public final Channel copy(String channelName, String start, String end) {
/* 3 */             return new Channel(channelName, start, end);
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof Channel)) {
/* 7 */                 return false;
                    }
/* 11 */            Channel channel = (Channel) other;
                    return O0000Ioio00.I0000O(this.channelName, channel.channelName) && O0000Ioio00.I0000O(this.start, channel.start) && O0000Ioio00.I0000O(this.end, channel.end);
                }

                public final String getChannelName() {
/* 1 */             return this.channelName;
                }

                public final String getEnd() {
/* 1 */             return this.end;
                }

                public final String getStart() {
/* 1 */             return this.start;
                }

                public int hashCode() {
/* 22 */            return this.end.hashCode() + Oi010OO0.I000O01llI0(this.channelName.hashCode() * 31, 31, this.start);
                }

                public final O01l0lO0li m10x6d7146a3() {
/* 3 */             O01l0lO0li o01l0lO0li = new O01l0lO0li();
/* 10 */            o01l0lO0li.I0001Ioi1lo("channel_name", this.channelName);
/* 17 */            o01l0lO0li.I0001Ioi1lo("start", this.start);
/* 24 */            o01l0lO0li.I0001Ioi1lo("end", this.end);
/* 55 */            return o01l0lO0li;
                }

                public String toString() {
/* 1 */             String str = this.channelName;
/* 3 */             String str2 = this.start;
/* 19 */            return IIl001iO0Io.I00100l0(IIl001iO0Io.I00111O("Channel(channelName=", str, ", start=", str2, ", end="), this.end, ")");
                }
            }
