            package p000;

            import java.io.ByteArrayInputStream;
            import java.io.ByteArrayOutputStream;
            import java.io.DataInputStream;
            import java.io.DataOutputStream;
            import java.io.IOException;
            import java.io.ObjectInputStream;
            import java.io.Serializable;
            import java.util.HashMap;
            import java.util.LinkedHashMap;
            import java.util.Map;
            
            public abstract class il01ool0o {
                public static Ii11I1OOII1 I00000oIO(byte[] bArr) {
/* 6 */             if (bArr.length > 10240) {
/* 195 */               I000II.I001IO000("Data cannot occupy more than 10240 bytes when serialized");
/* 198 */               return null;
                    }
/* 9 */             if (bArr.length == 0) {
/* 11 */                return Ii11I1OOII1.I00000oOI;
                    }
/* 16 */            LinkedHashMap linkedHashMap = new LinkedHashMap();
                    try {
/* 21 */                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
/* 25 */                byte[] bArr2 = new byte[2];
/* 27 */                byteArrayInputStream.read(bArr2);
/* 30 */                int i = 0;
/* 46 */                boolean z = bArr2[0] == -84 && bArr2[1] == -19;
/* 47 */                byteArrayInputStream.reset();
/* 50 */                if (z) {
/* 54 */                    ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                            try {
/* 57 */                        int i2 = objectInputStream.readInt();
/* 61 */                        while (i < i2) {
/* 71 */                            linkedHashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
/* 74 */                            i++;
                                }
/* 79 */                        objectInputStream.close();
                            } finally {
                            }
                        } else {
/* 95 */                    DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                            try {
/* 98 */                        short s = dataInputStream.readShort();
/* 104 */                       if (s == -21521) {
/* 106 */                           short s2 = dataInputStream.readShort();
/* 110 */                           if (s2 != 1) {
/* 119 */                               IOOlIIilOl0.I0000oI00(Oi010OO0.I000oI1ioi(s2, "Unsupported version number: "));
                                    }
                                } else {
/* 129 */                           IOOlIIilOl0.I0000oI00(Oi010OO0.I000oI1ioi(s, "Magic number doesn't match: "));
                                }
/* 132 */                       int i3 = dataInputStream.readInt();
/* 136 */                       while (i < i3) {
/* 150 */                           linkedHashMap.put(dataInputStream.readUTF(), I00000oOI(dataInputStream, dataInputStream.readByte()));
/* 153 */                           i++;
                                }
/* 158 */                       dataInputStream.close();
                            } finally {
                            }
                        }
                    } catch (IOException e) {
/* 184 */               IIi0oIl.I000II().I0001Ioi1lo(Ii1OOOlOIO.I00000oIO, "Error in Data#fromByteArray: ", e);
                    } catch (ClassNotFoundException e2) {
/* 174 */               IIi0oIl.I000II().I0001Ioi1lo(Ii1OOOlOIO.I00000oIO, "Error in Data#fromByteArray: ", e2);
                    }
/* 189 */           return new Ii11I1OOII1(linkedHashMap);
                }

                /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Serializable, java.lang.Double[]] */
                /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, java.lang.Float[]] */
                /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Serializable, java.lang.Long[]] */
                /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Serializable, java.lang.Integer[]] */
                /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Serializable, java.lang.Byte[]] */
                /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Serializable, java.lang.Boolean[]] */
                /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Serializable, java.lang.String[]] */
                public static final Serializable I00000oOI(DataInputStream dataInputStream, byte b) throws IOException {
/* 2 */             if (b == 0) {
/* 1 */                 return null;
                    }
/* 6 */             if (b == 1) {
/* 12 */                return Boolean.valueOf(dataInputStream.readBoolean());
                    }
/* 18 */            if (b == 2) {
/* 24 */                return Byte.valueOf(dataInputStream.readByte());
                    }
/* 30 */            if (b == 3) {
/* 36 */                return Integer.valueOf(dataInputStream.readInt());
                    }
/* 42 */            if (b == 4) {
/* 48 */                return Long.valueOf(dataInputStream.readLong());
                    }
/* 54 */            if (b == 5) {
/* 60 */                return Float.valueOf(dataInputStream.readFloat());
                    }
/* 66 */            if (b == 6) {
/* 72 */                return Double.valueOf(dataInputStream.readDouble());
                    }
/* 78 */            if (b == 7) {
/* 80 */                return dataInputStream.readUTF();
                    }
/* 87 */            int i = 0;
/* 88 */            if (b == 8) {
/* 90 */                int i2 = dataInputStream.readInt();
/* 94 */                ?? r0 = new Boolean[i2];
/* 96 */                while (i < i2) {
/* 106 */                   r0[i] = Boolean.valueOf(dataInputStream.readBoolean());
/* 108 */                   i++;
                        }
/* 111 */               return r0;
                    }
/* 114 */           if (b == 9) {
/* 116 */               int i3 = dataInputStream.readInt();
/* 120 */               ?? r02 = new Byte[i3];
/* 122 */               while (i < i3) {
/* 132 */                   r02[i] = Byte.valueOf(dataInputStream.readByte());
/* 134 */                   i++;
                        }
/* 137 */               return r02;
                    }
/* 140 */           if (b == 10) {
/* 142 */               int i4 = dataInputStream.readInt();
/* 146 */               ?? r03 = new Integer[i4];
/* 148 */               while (i < i4) {
/* 158 */                   r03[i] = Integer.valueOf(dataInputStream.readInt());
/* 160 */                   i++;
                        }
/* 163 */               return r03;
                    }
/* 166 */           if (b == 11) {
/* 168 */               int i5 = dataInputStream.readInt();
/* 172 */               ?? r04 = new Long[i5];
/* 174 */               while (i < i5) {
/* 184 */                   r04[i] = Long.valueOf(dataInputStream.readLong());
/* 186 */                   i++;
                        }
/* 189 */               return r04;
                    }
/* 192 */           if (b == 12) {
/* 194 */               int i6 = dataInputStream.readInt();
/* 198 */               ?? r05 = new Float[i6];
/* 200 */               while (i < i6) {
/* 210 */                   r05[i] = Float.valueOf(dataInputStream.readFloat());
/* 212 */                   i++;
                        }
/* 215 */               return r05;
                    }
/* 218 */           if (b == 13) {
/* 220 */               int i7 = dataInputStream.readInt();
/* 224 */               ?? r06 = new Double[i7];
/* 226 */               while (i < i7) {
/* 236 */                   r06[i] = Double.valueOf(dataInputStream.readDouble());
/* 238 */                   i++;
                        }
/* 241 */               return r06;
                    }
/* 244 */           if (b != 14) {
/* 279 */               I000II.I001IO000(Oi010OO0.I000oI1ioi(b, "Unsupported type "));
/* 1 */                 return null;
                    }
/* 246 */           int i8 = dataInputStream.readInt();
/* 250 */           ?? r1 = new String[i8];
/* 252 */           while (i < i8) {
/* 254 */               String utf = dataInputStream.readUTF();
/* 264 */               if (O0000Ioio00.I0000O(utf, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
/* 266 */                   utf = null;
                        }
/* 267 */               r1[i] = utf;
/* 269 */               i++;
                    }
/* 272 */           return r1;
                }

                public static byte[] I0000Il00O(Ii11I1OOII1 ii11I1OOII1) {
/* 1 */             HashMap map = ii11I1OOII1.I00000oIO;
                    try {
/* 5 */                 ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/* 10 */                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                        try {
/* 15 */                    dataOutputStream.writeShort(-21521);
/* 19 */                    dataOutputStream.writeShort(1);
/* 26 */                    dataOutputStream.writeInt(map.size());
/* 41 */                    for (Map.Entry entry : map.entrySet()) {
/* 59 */                        I0000O(dataOutputStream, (String) entry.getKey(), entry.getValue());
                            }
/* 65 */                    dataOutputStream.flush();
/* 74 */                    if (dataOutputStream.size() > 10240) {
/* 91 */                        throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                            }
/* 76 */                    byte[] byteArray = byteArrayOutputStream.toByteArray();
/* 80 */                    dataOutputStream.close();
/* 83 */                    return byteArray;
                        } finally {
                        }
                    } catch (IOException e) {
/* 107 */               IIi0oIl.I000II().I0001Ioi1lo(Ii1OOOlOIO.I00000oIO, "Error in Data#toByteArray: ", e);
/* 111 */               return new byte[0];
                    }
                }

                public static final void I0000O(DataOutputStream dataOutputStream, String str, Object obj) throws IOException {
                    int i;
/* 6 */             if (obj == null) {
/* 8 */                 dataOutputStream.writeByte(0);
                    } else if (obj instanceof Boolean) {
/* 18 */                dataOutputStream.writeByte(1);
/* 27 */                dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
                    } else if (obj instanceof Byte) {
/* 37 */                dataOutputStream.writeByte(2);
/* 46 */                dataOutputStream.writeByte(((Number) obj).byteValue());
                    } else if (obj instanceof Integer) {
/* 56 */                dataOutputStream.writeByte(3);
/* 65 */                dataOutputStream.writeInt(((Number) obj).intValue());
                    } else if (obj instanceof Long) {
/* 75 */                dataOutputStream.writeByte(4);
/* 84 */                dataOutputStream.writeLong(((Number) obj).longValue());
                    } else if (obj instanceof Float) {
/* 94 */                dataOutputStream.writeByte(5);
/* 103 */               dataOutputStream.writeFloat(((Number) obj).floatValue());
                    } else if (obj instanceof Double) {
/* 113 */               dataOutputStream.writeByte(6);
/* 122 */               dataOutputStream.writeDouble(((Number) obj).doubleValue());
                    } else if (obj instanceof String) {
/* 132 */               dataOutputStream.writeByte(7);
/* 137 */               dataOutputStream.writeUTF((String) obj);
                    } else {
/* 146 */               if (!(obj instanceof Object[])) {
/* 469 */                   IoOOl0iOl1io.I001l0I00("Unsupported value type ", OOoOl0i.I00000oIO.I00000oOI(obj.getClass()).I000oI1ioi());
/* 1638 */                  return;
                        }
/* 148 */               Object[] objArr = (Object[]) obj;
/* 150 */               Class<?> cls = objArr.getClass();
/* 154 */               OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 156 */               O0IOli0o0 o0IOli0o0I00000oOI = oOoOl1001II.I00000oOI(cls);
/* 184 */               if (o0IOli0o0I00000oOI.equals(oOoOl1001II.I00000oOI(Boolean[].class))) {
/* 186 */                   i = 8;
                        } else if (o0IOli0o0I00000oOI.equals(oOoOl1001II.I00000oOI(Byte[].class))) {
/* 200 */                   i = 9;
                        } else if (o0IOli0o0I00000oOI.equals(oOoOl1001II.I00000oOI(Integer[].class))) {
/* 214 */                   i = 10;
                        } else if (o0IOli0o0I00000oOI.equals(oOoOl1001II.I00000oOI(Long[].class))) {
/* 228 */                   i = 11;
                        } else if (o0IOli0o0I00000oOI.equals(oOoOl1001II.I00000oOI(Float[].class))) {
/* 242 */                   i = 12;
                        } else if (o0IOli0o0I00000oOI.equals(oOoOl1001II.I00000oOI(Double[].class))) {
/* 256 */                   i = 13;
                        } else {
/* 268 */                   if (!o0IOli0o0I00000oOI.equals(oOoOl1001II.I00000oOI(String[].class))) {
/* 451 */                       IoOOl0iOl1io.I001l0I00("Unsupported value type ", oOoOl1001II.I00000oOI(objArr.getClass()).I000O01llI0());
/* 454 */                       return;
                            }
/* 270 */                   i = 14;
                        }
/* 271 */               dataOutputStream.writeByte(i);
/* 275 */               dataOutputStream.writeInt(objArr.length);
/* 280 */               for (Object obj2 : objArr) {
/* 285 */                   if (i == 8) {
/* 292 */                       Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
/* 302 */                       dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                            } else if (i == 9) {
/* 314 */                       Byte b = obj2 instanceof Byte ? (Byte) obj2 : null;
/* 324 */                       dataOutputStream.writeByte(b != null ? b.byteValue() : (byte) 0);
                            } else if (i == 10) {
/* 336 */                       Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
/* 346 */                       dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                            } else if (i == 11) {
/* 357 */                       Long l = obj2 instanceof Long ? (Long) obj2 : null;
/* 368 */                       dataOutputStream.writeLong(l != null ? l.longValue() : 0L);
                            } else if (i == 12) {
/* 379 */                       Float f = obj2 instanceof Float ? (Float) obj2 : null;
/* 389 */                       dataOutputStream.writeFloat(f != null ? f.floatValue() : 0.0f);
                            } else if (i == 13) {
/* 400 */                       Double d = obj2 instanceof Double ? (Double) obj2 : null;
/* 411 */                       dataOutputStream.writeDouble(d != null ? d.doubleValue() : 0.0d);
                            } else if (i == 14) {
/* 422 */                       String str2 = obj2 instanceof String ? (String) obj2 : null;
/* 424 */                       if (str2 == null) {
/* 426 */                           str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                                }
/* 428 */                       dataOutputStream.writeUTF(str2);
                            }
                        }
                    }
/* 435 */           dataOutputStream.writeUTF(str);
                }
            }
