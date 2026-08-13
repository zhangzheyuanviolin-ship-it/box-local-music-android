            package p000;

            import org.json.JSONException;
            import org.json.JSONObject;
            
            public final class o0loO110 implements o0l0iIlo0O {
                public final String I00000oIO;
                public final String I00000oOI;
                public final String I0000Il00O;
                public final String I0000O;

                public o0loO110(String str, String str2, String str3, String str4) {
/* 4 */             this.I00000oIO = str;
/* 6 */             this.I00000oOI = str2;
/* 8 */             this.I0000Il00O = str3;
/* 10 */            this.I0000O = str4;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 56 */                return true;
                    }
/* 6 */             if (!(obj instanceof o0loO110)) {
/* 54 */                return false;
                    }
/* 9 */             o0loO110 o0loo110 = (o0loO110) obj;
                    return this.I00000oIO.equals(o0loo110.I00000oIO) && this.I00000oOI.equals(o0loo110.I00000oOI) && this.I0000Il00O.equals(o0loo110.I0000Il00O) && O0000Ioio00.I0000O(this.I0000O, o0loo110.I0000O);
                }

                public final int hashCode() {
/* 33 */            return this.I0000O.hashCode() + ((this.I0000Il00O.hashCode() + ((this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31)) * 31);
                }

                public final String toString() {
/* 1 */             String str = this.I00000oIO;
/* 3 */             int length = str.length();
/* 7 */             String str2 = this.I00000oOI;
/* 9 */             int length2 = str2.length();
/* 13 */            String str3 = this.I0000Il00O;
/* 15 */            int length3 = str3.length();
/* 19 */            String str4 = this.I0000O;
/* 42 */            StringBuilder sb = new StringBuilder(length + 34 + length2 + 15 + length3 + 12 + String.valueOf(str4).length() + 1);
/* 49 */            IIl001iO0Io.I001lIiIIo1O(sb, "ExplicitCacheMetadata(name=", str, ", path=", str2);
/* 56 */            IIl001iO0Io.I001lIiIIo1O(sb, ", promptPrefix=", str3, ", modelName=", str4);
/* 61 */            sb.append(")");
/* 64 */            return sb.toString();
                }

                @Override
                public final String zza() {
/* 1 */             return this.I00000oIO;
                }

                @Override
                public final String zzb() {
/* 1 */             return this.I00000oOI;
                }

                @Override
                public final JSONObject zzc() throws JSONException {
/* 3 */             JSONObject jSONObject = new JSONObject();
/* 10 */            jSONObject.put("name", this.I00000oIO);
/* 17 */            jSONObject.put("path", this.I00000oOI);
/* 24 */            jSONObject.put("prompt_prefix", this.I0000Il00O);
/* 31 */            jSONObject.put("model_name", this.I0000O);
/* 55 */            return jSONObject;
                }
            }
