            package p000;

            import com.google.ai.edge.litertlm.Contents;
            import com.google.ai.edge.litertlm.Conversation;
            import com.google.ai.edge.litertlm.Engine;
            import java.util.List;
            
/* 11 */    public final class O11illi {
                public final Engine I00000oIO;
                public final Conversation I00000oOI;
                public final Contents I0000Il00O;
                public final List I0000O;

                public O11illi(Engine engine, Conversation conversation, Contents contents, List list) {
/* 4 */             this.I00000oIO = engine;
/* 6 */             this.I00000oOI = conversation;
/* 8 */             this.I0000Il00O = contents;
/* 10 */            this.I0000O = list;
                }

                public static O11illi I00000oIO(O11illi o11illi, Conversation conversation, Contents contents, List list, int i) {
/* 1 */             Engine engine = o11illi.I00000oIO;
/* 5 */             if ((i & 4) != 0) {
/* 7 */                 contents = o11illi.I0000Il00O;
                    }
/* 11 */            if ((i & 8) != 0) {
/* 13 */                list = o11illi.I0000O;
                    }
/* 15 */            o11illi.getClass();
/* 20 */            return new O11illi(engine, conversation, contents, list);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof O11illi)) {
/* 7 */                 return false;
                    }
/* 11 */            O11illi o11illi = (O11illi) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, o11illi.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, o11illi.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, o11illi.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, o11illi.I0000O);
                }

                public final int hashCode() {
/* 16 */            int iHashCode = (this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31;
/* 18 */            Contents contents = this.I0000Il00O;
/* 37 */            return this.I0000O.hashCode() + ((iHashCode + (contents == null ? 0 : contents.hashCode())) * 31);
                }

                public final String toString() {
/* 48 */            return "LlmModelInstance(engine=" + this.I00000oIO + ", conversation=" + this.I00000oOI + ", systemInstruction=" + this.I0000Il00O + ", tools=" + this.I0000O + ")";
                }

/* 12 */        public O11illi(Engine engine, Conversation conversation) {
/* 14 */            this(engine, conversation, null, Il01100l.I00iOIl);
                }
            }
