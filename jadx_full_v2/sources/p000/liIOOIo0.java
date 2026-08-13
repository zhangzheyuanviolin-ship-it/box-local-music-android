            package p000;

            import android.net.NetworkRequest;
            import android.net.Uri;
            import java.io.ByteArrayInputStream;
            import java.io.ByteArrayOutputStream;
            import java.io.IOException;
            import java.io.ObjectInputStream;
            import java.io.ObjectOutputStream;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.Set;
            
            public abstract class liIOOIo0 {
                public static final int I00000oIO(I1o1O1Ii1l0l i1o1O1Ii1l0l) {
/* 1 */             int iOrdinal = i1o1O1Ii1l0l.ordinal();
/* 6 */             if (iOrdinal != 0) {
/* 9 */                 if (iOrdinal == 1) {
/* 8 */                     return 1;
                        }
/* 12 */                I000II.I00000oIO();
                    }
/* 5 */             return 0;
                }

                public static final LinkedHashSet I00000oOI(byte[] bArr) throws IOException {
                    ObjectInputStream objectInputStream;
/* 3 */             LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 7 */             if (bArr.length == 0) {
/* 9 */                 return linkedHashSet;
                    }
/* 12 */            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                    try {
                        try {
/* 17 */                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                        } catch (IOException e) {
/* 66 */                    e.printStackTrace();
                        }
                        try {
/* 20 */                    int i = objectInputStream.readInt();
/* 25 */                    for (int i2 = 0; i2 < i; i2++) {
/* 44 */                        linkedHashSet.add(new IOo0iolo(objectInputStream.readBoolean(), Uri.parse(objectInputStream.readUTF())));
                            }
/* 52 */                    objectInputStream.close();
/* 69 */                    byteArrayInputStream.close();
/* 72 */                    return linkedHashSet;
                        } finally {
                        }
                    } finally {
                    }
                }

                public static final byte[] I0000Il00O(OIIOOo oIIOOo) throws IOException {
/* 3 */             NetworkRequest networkRequest = (NetworkRequest) oIIOOo.I00000oIO;
/* 6 */             if (networkRequest == null) {
/* 8 */                 return new byte[0];
                    }
/* 13 */            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
/* 18 */                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                        try {
/* 21 */                    int[] transportTypes = networkRequest.getTransportTypes();
/* 25 */                    int[] capabilities = networkRequest.getCapabilities();
/* 30 */                    objectOutputStream.writeInt(transportTypes.length);
/* 35 */                    for (int i : transportTypes) {
/* 39 */                        objectOutputStream.writeInt(i);
                            }
/* 48 */                    objectOutputStream.writeInt(capabilities.length);
/* 52 */                    for (int i2 : capabilities) {
/* 56 */                        objectOutputStream.writeInt(i2);
                            }
/* 62 */                    objectOutputStream.close();
/* 65 */                    byteArrayOutputStream.close();
/* 68 */                    return byteArrayOutputStream.toByteArray();
                        } finally {
                        }
                    } finally {
                    }
                }

                public static final I1o1O1Ii1l0l I0000O(int i) {
/* 1 */             if (i == 0) {
/* 22 */                return I1o1O1Ii1l0l.I00iOIl;
                    }
/* 4 */             if (i == 1) {
/* 6 */                 return I1o1O1Ii1l0l.I00iiI;
                    }
/* 17 */            I000II.I000iOII(IIlIOloOOO.I00100l0("Could not convert ", i, " to BackoffPolicy"));
/* 20 */            return null;
                }

                public static final OIIOlI I0000oI00(int i) {
/* 1 */             if (i == 0) {
/* 46 */                return OIIOlI.I00iOIl;
                    }
/* 4 */             if (i == 1) {
/* 43 */                return OIIOlI.I00iiI;
                    }
/* 7 */             if (i == 2) {
/* 40 */                return OIIOlI.I00iiO;
                    }
/* 10 */            if (i == 3) {
/* 37 */                return OIIOlI.I00iio;
                    }
/* 13 */            if (i == 4) {
/* 34 */                return OIIOlI.I00ilI0I1;
                    }
/* 16 */            if (i == 5) {
/* 18 */                return OIIOlI.I00ilO0;
                    }
/* 29 */            I000II.I000iOII(IIlIOloOOO.I00100l0("Could not convert ", i, " to NetworkType"));
/* 32 */            return null;
                }

                public static final OIio0Ii1Ii I0001Ioi1lo(int i) {
/* 1 */             if (i == 0) {
/* 22 */                return OIio0Ii1Ii.I00iOIl;
                    }
/* 4 */             if (i == 1) {
/* 6 */                 return OIio0Ii1Ii.I00iiI;
                    }
/* 17 */            I000II.I000iOII(IIlIOloOOO.I00100l0("Could not convert ", i, " to OutOfQuotaPolicy"));
/* 20 */            return null;
                }

                public static final i01IOiO1lO I000II(int i) {
/* 1 */             if (i == 0) {
/* 46 */                return i01IOiO1lO.I00iOIl;
                    }
/* 4 */             if (i == 1) {
/* 43 */                return i01IOiO1lO.I00iiI;
                    }
/* 7 */             if (i == 2) {
/* 40 */                return i01IOiO1lO.I00iiO;
                    }
/* 10 */            if (i == 3) {
/* 37 */                return i01IOiO1lO.I00iio;
                    }
/* 13 */            if (i == 4) {
/* 34 */                return i01IOiO1lO.I00ilI0I1;
                    }
/* 16 */            if (i == 5) {
/* 18 */                return i01IOiO1lO.I00ilO0;
                    }
/* 29 */            I000II.I000iOII(IIlIOloOOO.I00100l0("Could not convert ", i, " to State"));
/* 32 */            return null;
                }

                public static final int I000O01llI0(OIIOlI oIIOlI) {
/* 1 */             int iOrdinal = oIIOlI.ordinal();
/* 6 */             if (iOrdinal == 0) {
/* 5 */                 return 0;
                    }
/* 8 */             int i = 1;
/* 9 */             if (iOrdinal != 1) {
/* 11 */                i = 2;
/* 12 */                if (iOrdinal != 2) {
/* 14 */                    i = 3;
/* 15 */                    if (iOrdinal != 3) {
/* 17 */                        i = 4;
/* 18 */                        if (iOrdinal != 4) {
/* 22 */                            if (oIIOlI == OIIOlI.I00ilO0) {
/* 24 */                                return 5;
                                    }
/* 30 */                            OoOil11Ol1o.I000OOo1O(oIIOlI, "Could not convert ", " to int");
/* 5 */                             return 0;
                                }
                            }
                        }
                    }
/* 34 */            return i;
                }

                public static final int I000OOo1O(OIio0Ii1Ii oIio0Ii1Ii) {
/* 1 */             int iOrdinal = oIio0Ii1Ii.ordinal();
/* 6 */             if (iOrdinal != 0) {
/* 9 */                 if (iOrdinal == 1) {
/* 8 */                     return 1;
                        }
/* 12 */                I000II.I00000oIO();
                    }
/* 5 */             return 0;
                }

                public static final byte[] I000OiO(Set set) throws IOException {
/* 5 */             if (set.isEmpty()) {
/* 8 */                 return new byte[0];
                    }
/* 13 */            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
/* 18 */                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                        try {
/* 25 */                    objectOutputStream.writeInt(set.size());
/* 28 */                    Iterator it = set.iterator();
/* 36 */                    while (it.hasNext()) {
/* 42 */                        IOo0iolo iOo0iolo = (IOo0iolo) it.next();
/* 50 */                        objectOutputStream.writeUTF(iOo0iolo.I00000oIO.toString());
/* 55 */                        objectOutputStream.writeBoolean(iOo0iolo.I00000oOI);
                            }
/* 61 */                    objectOutputStream.close();
/* 64 */                    byteArrayOutputStream.close();
/* 67 */                    return byteArrayOutputStream.toByteArray();
                        } finally {
                        }
                    } finally {
                    }
                }

                public static final int I000iOII(i01IOiO1lO i01ioio1lo) {
/* 1 */             int iOrdinal = i01ioio1lo.ordinal();
/* 6 */             if (iOrdinal == 0) {
/* 5 */                 return 0;
                    }
/* 8 */             int i = 1;
/* 9 */             if (iOrdinal != 1) {
/* 11 */                i = 2;
/* 12 */                if (iOrdinal != 2) {
/* 14 */                    i = 3;
/* 15 */                    if (iOrdinal != 3) {
/* 17 */                        i = 4;
/* 18 */                        if (iOrdinal != 4) {
/* 21 */                            if (iOrdinal == 5) {
/* 20 */                                return 5;
                                    }
/* 24 */                            I000II.I00000oIO();
/* 5 */                             return 0;
                                }
                            }
                        }
                    }
/* 28 */            return i;
                }

                public static final OIIOOo I000l1(byte[] bArr) throws IOException {
/* 2 */             if (bArr.length == 0) {
/* 7 */                 return new OIIOOo(null);
                    }
/* 13 */            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                    try {
/* 18 */                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                        try {
/* 21 */                    int i = objectInputStream.readInt();
/* 25 */                    int[] iArr = new int[i];
/* 29 */                    for (int i2 = 0; i2 < i; i2++) {
/* 35 */                        iArr[i2] = objectInputStream.readInt();
                            }
/* 42 */                    int i3 = objectInputStream.readInt();
/* 46 */                    int[] iArr2 = new int[i3];
/* 48 */                    for (int i4 = 0; i4 < i3; i4++) {
/* 54 */                        iArr2[i4] = objectInputStream.readInt();
                            }
/* 65 */                    OIIOOo oIIOOo = new OIIOOo(l1il0l0IoOO1.I00000oIO(iArr2, iArr));
/* 68 */                    objectInputStream.close();
/* 71 */                    byteArrayInputStream.close();
/* 74 */                    return oIIOOo;
                        } finally {
                        }
                    } finally {
                    }
                }
            }
