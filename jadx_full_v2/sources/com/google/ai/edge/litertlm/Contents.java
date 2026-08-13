            package com.google.ai.edge.litertlm;

            import com.google.ai.edge.litertlm.Content;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.I1IoiO1l;
            import p000.IOOi0Ool1i;
            import p000.Il01100l;
            import p000.O01I0il01001;
            
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0017\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/google/ai/edge/litertlm/Contents;", "", "", "Lcom/google/ai/edge/litertlm/Content;", "contents", "<init>", "(Ljava/util/List;)V", "LO01I0il01001;", "toJson$third_party_odml_litert_lm_kotlin_java_com_google_ai_edge_litertlm_litertlm_android", "()LO01I0il01001;", "toJson", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getContents", "()Ljava/util/List;", "Companion", "third_party.odml.litert_lm.kotlin.java.com.google.ai.edge.litertlm_litertlm-android"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 2 */     public final class Contents {

                public static final Companion INSTANCE = new Companion(null);
                private final List<Content> contents;

                /* JADX WARN: Multi-variable type inference failed */
                private Contents(List<? extends Content> list) {
/* 4 */             this.contents = list;
                }

                public final List<Content> getContents() {
/* 1 */             return this.contents;
                }

                public final O01I0il01001 m12x6d7146a3() {
/* 3 */             O01I0il01001 o01I0il01001 = new O01I0il01001();
/* 8 */             Iterator<Content> it = this.contents.iterator();
/* 16 */            while (it.hasNext()) {
/* 28 */                o01I0il01001.I0000oI00(it.next().mo11x6d7146a3());
                    }
/* 55 */            return o01I0il01001;
                }

                public String toString() {
/* 13 */            return IOOi0Ool1i.I00IlilI0i0i(this.contents, "", null, null, null, 62);
                }

                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0006J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tJ\u001f\u0010\u0007\u001a\u00020\u00052\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b\"\u00020\f¢\u0006\u0002\u0010\rJ\u0014\u0010\u0007\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000e¨\u0006\u000f"}, d2 = {"Lcom/google/ai/edge/litertlm/Contents$Companion;", "", "<init>", "()V", "empty", "Lcom/google/ai/edge/litertlm/Contents;", "empty$third_party_odml_litert_lm_kotlin_java_com_google_ai_edge_litertlm_litertlm_android", "of", "text", "", "contents", "", "Lcom/google/ai/edge/litertlm/Content;", "([Lcom/google/ai/edge/litertlm/Content;)Lcom/google/ai/edge/litertlm/Contents;", "", "third_party.odml.litert_lm.kotlin.java.com.google.ai.edge.litertlm_litertlm-android"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 3 */         public static final class Companion {
                    public Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    public final Contents m13x642e38ed() {
/* 6 */                 return new Contents(Il01100l.I00iOIl, null);
                    }

                    public final Contents of(String text) {
/* 14 */                return Contents.INSTANCE.of(new Content.Text(text));
                    }

/* 4 */             private Companion() {
                    }

/* 18 */            public final Contents of(Content... contents) {
/* 19 */                return Contents.INSTANCE.of(I1IoiO1l.I00IioO0OiOi(contents));
                    }

/* 19 */            public final Contents of(List<? extends Content> contents) {
/* 20 */                return new Contents(contents, null);
                    }
                }

/* 6 */         public Contents(List list, DefaultConstructorMarker defaultConstructorMarker) {
/* 7 */             this(list);
                }
            }
