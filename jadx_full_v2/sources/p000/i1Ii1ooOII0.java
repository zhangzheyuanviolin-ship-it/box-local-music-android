            package p000;

            import org.json.JSONException;
            import org.json.JSONObject;
            
            public final class i1Ii1ooOII0 implements o0l0iIlo0O {
                public final String I00000oIO;
                public final String I00000oOI;
                public final long I0000Il00O;
                public final String I0000O;

                public i1Ii1ooOII0(long j, String str, String str2, String str3) {
/* 4 */             this.I00000oIO = str;
/* 6 */             this.I00000oOI = str2;
/* 8 */             this.I0000Il00O = j;
/* 10 */            this.I0000O = str3;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 54 */                return true;
                    }
/* 6 */             if (!(obj instanceof i1Ii1ooOII0)) {
/* 52 */                return false;
                    }
/* 9 */             i1Ii1ooOII0 i1ii1oooii0 = (i1Ii1ooOII0) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, i1ii1oooii0.I00000oIO) && this.I00000oOI.equals(i1ii1oooii0.I00000oOI) && this.I0000Il00O == i1ii1oooii0.I0000Il00O && O0000Ioio00.I0000O(this.I0000O, i1ii1oooii0.I0000O);
                }

                public final int hashCode() {
/* 33 */            return this.I0000O.hashCode() + ((Long.hashCode(this.I0000Il00O) + ((this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31)) * 31);
                }

                public final String toString() {
/* 1 */             String str = this.I00000oIO;
/* 7 */             int length = String.valueOf(str).length();
/* 11 */            String str2 = this.I00000oOI;
/* 13 */            int length2 = str2.length();
/* 17 */            long j = this.I0000Il00O;
/* 23 */            int length3 = String.valueOf(j).length();
/* 27 */            String str3 = this.I0000O;
/* 50 */            StringBuilder sb = new StringBuilder(length + 34 + length2 + 17 + length3 + 12 + String.valueOf(str3).length() + 1);
/* 57 */            IIl001iO0Io.I001lIiIIo1O(sb, "ImplicitCacheMetadata(name=", str, ", path=", str2);
/* 62 */            sb.append(", lastAccessTime=");
/* 65 */            sb.append(j);
/* 70 */            sb.append(", modelName=");
/* 75 */            return IIl001iO0Io.I00100l0(sb, str3, ")");
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
/* 10 */            jSONObject.put("id", this.I00000oIO);
/* 17 */            jSONObject.put("path", this.I00000oOI);
/* 24 */            jSONObject.put("last_access_time", this.I0000Il00O);
/* 31 */            jSONObject.put("model_name", this.I0000O);
/* 55 */            return jSONObject;
                }
            }
