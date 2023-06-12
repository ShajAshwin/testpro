<?xml version="1.0" encoding="UTF-8" ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <table cellpadding="2" cellspacing="2" border="1">
            <tr>
               <th>Id</th>
               <th>Name</th>
               <th>Price</th>
            </tr>
            <xsl:apply-templates select="products"/>
        </table>
    </xsl:template>
    <xsl:template match="products">
        <xsl:apply-templates select="product"></xsl:apply-templates>
    </xsl:template>
    <xsl:template match="product">
        <tr>
            <td>
                <xsl:value-of select="id"></xsl:value-of>
            </td>
            <td>
                <xsl:value-of select="name"></xsl:value-of>
            </td>
            <td>
                <xsl:value-of select="price"></xsl:value-of>
            </td>
        </tr>
    </xsl:template>
</xsl:stylesheet>