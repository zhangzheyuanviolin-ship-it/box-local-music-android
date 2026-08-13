            package com.google.ai.edge.gallery.common;

            import kotlin.Metadata;
            import p000.IOOlIIilOl0;
            import p000.Il01llIol0;
            import p000.O011ioiO1OI;
            import p000.O01lo1il;
            import p000.O01ooIO00oio;
            import p000.OI011oo1;
            
            @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/google/ai/edge/gallery/common/CallJsSkillResultJsonAdapter;", "LO011ioiO1OI;", "Lcom/google/ai/edge/gallery/common/CallJsSkillResult;", "LOI011oo1;", "moshi", "<init>", "(LOI011oo1;)V", "", "toString", "()Ljava/lang/String;", "LO01lo1il;", "reader", "fromJson", "(LO01lo1il;)Lcom/google/ai/edge/gallery/common/CallJsSkillResult;", "LO01ooIO00oio;", "writer", "value_", "LOoiIlOl1iI;", "toJson", "(LO01ooIO00oio;Lcom/google/ai/edge/gallery/common/CallJsSkillResult;)V", "LO01lo1il$I00000oIO;", "options", "LO01lo1il$I00000oIO;", "nullableStringAdapter", "LO011ioiO1OI;", "Lcom/google/ai/edge/gallery/common/CallJsSkillResultImage;", "nullableCallJsSkillResultImageAdapter", "Lcom/google/ai/edge/gallery/common/CallJsSkillResultWebview;", "nullableCallJsSkillResultWebviewAdapter", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class GeneratedJsonAdapter extends O011ioiO1OI {
                public static final int $stable = 8;
                private final O011ioiO1OI nullableCallJsSkillResultImageAdapter;
                private final O011ioiO1OI nullableCallJsSkillResultWebviewAdapter;
                private final O011ioiO1OI nullableStringAdapter;
                private final O01lo1il.I00000oIO options = O01lo1il.I00000oIO.of("result", "error", "image", "webview");

                public GeneratedJsonAdapter(OI011oo1 oI011oo1) {
/* 24 */            Il01llIol0 il01llIol0 = Il01llIol0.I00iOIl;
/* 30 */            this.nullableStringAdapter = oI011oo1.adapter(String.class, il01llIol0, "result");
/* 38 */            this.nullableCallJsSkillResultImageAdapter = oI011oo1.adapter(CallJsSkillResultImage.class, il01llIol0, "image");
/* 46 */            this.nullableCallJsSkillResultWebviewAdapter = oI011oo1.adapter(CallJsSkillResultWebview.class, il01llIol0, "webview");
                }

                @Override
                public CallJsSkillResult fromJson(O01lo1il reader) {
/* 1 */             reader.beginObject();
/* 4 */             String str = null;
/* 5 */             String str2 = null;
/* 6 */             CallJsSkillResultImage callJsSkillResultImage = null;
/* 7 */             CallJsSkillResultWebview callJsSkillResultWebview = null;
/* 12 */            while (reader.hasNext()) {
/* 16 */                int iSelectName = reader.selectName(this.options);
/* 21 */                if (iSelectName == -1) {
/* 71 */                    reader.skipName();
/* 74 */                    reader.skipValue();
                        } else if (iSelectName == 0) {
/* 68 */                    str = (String) this.nullableStringAdapter.fromJson(reader);
                        } else if (iSelectName == 1) {
/* 59 */                    str2 = (String) this.nullableStringAdapter.fromJson(reader);
                        } else if (iSelectName == 2) {
/* 50 */                    callJsSkillResultImage = (CallJsSkillResultImage) this.nullableCallJsSkillResultImageAdapter.fromJson(reader);
                        } else if (iSelectName == 3) {
/* 41 */                    callJsSkillResultWebview = (CallJsSkillResultWebview) this.nullableCallJsSkillResultWebviewAdapter.fromJson(reader);
                        }
                    }
/* 78 */            reader.endObject();
/* 83 */            return new CallJsSkillResult(str, str2, callJsSkillResultImage, callJsSkillResultWebview);
                }

                @Override
                public void toJson(O01ooIO00oio writer, CallJsSkillResult value_) {
/* 1 */             if (value_ == null) {
/* 68 */                IOOlIIilOl0.I000II("value_ was null! Wrap in .nullSafe() to write nullable values.");
/* 106 */               return;
                    }
/* 3 */             writer.beginObject();
/* 8 */             writer.name("result");
/* 17 */            this.nullableStringAdapter.toJson(writer, value_.getResult());
/* 22 */            writer.name("error");
/* 31 */            this.nullableStringAdapter.toJson(writer, value_.getError());
/* 36 */            writer.name("image");
/* 45 */            this.nullableCallJsSkillResultImageAdapter.toJson(writer, value_.getImage());
/* 50 */            writer.name("webview");
/* 59 */            this.nullableCallJsSkillResultWebviewAdapter.toJson(writer, value_.getWebview());
/* 62 */            writer.endObject();
                }

                public String toString() {
/* 5 */             StringBuilder sb = new StringBuilder(39);
/* 10 */            sb.append("GeneratedJsonAdapter(CallJsSkillResult)");
/* 13 */            return sb.toString();
                }
            }
